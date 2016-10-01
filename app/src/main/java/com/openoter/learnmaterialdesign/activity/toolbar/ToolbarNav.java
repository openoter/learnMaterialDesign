package com.openoter.learnmaterialdesign.activity.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.openoter.learnmaterialdesign.R;
import com.openoter.learnmaterialdesign.activity.base.BaseActivity;

/**
 * @description ToolBar导航
 * @author openoter
 * @date 2016/10/1
 */
public class ToolbarNav extends BaseActivity implements View.OnClickListener{

    private Button btn_toolbar_base, btn_toolbar_zh;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.toolbar_nav);

        btn_toolbar_base = (Button) findViewById(R.id.btn_toolbar_base);
        btn_toolbar_zh = (Button) findViewById(R.id.btn_toolbar_zh);

        btn_toolbar_base.setOnClickListener(this);
        btn_toolbar_zh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_toolbar_base:
                intent.setClass(ToolbarNav.this, ToolbarBase.class);
                break;
            case R.id.btn_toolbar_zh:
                intent.setClass(ToolbarNav.this, ToolbarZhiHu.class);
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
