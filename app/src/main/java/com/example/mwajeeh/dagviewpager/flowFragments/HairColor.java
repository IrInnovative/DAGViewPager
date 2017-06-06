package com.example.mwajeeh.dagviewpager.flowFragments;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.mwajeeh.dagviewpager.R;

public class HairColor extends BasePageFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_hair_color;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RadioGroup eyeColor = (RadioGroup) view.findViewById(R.id.hairColor);
        eyeColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                Bundle bundle = new Bundle();
                bundle.putString("Hair Color", ((RadioButton) view.findViewById(checkedId)).getText().toString());
                addFlowParams(bundle);
            }
        });
    }

    @Override
    public boolean validate() {
        Bundle params = getMyFlowParams();
        return params != null && params.getString("Hair Color", null) != null;
    }
}
