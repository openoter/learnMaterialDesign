package com.openoter.learnmaterialdesign.activity.toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.openoter.learnmaterialdesign.R;
import com.openoter.learnmaterialdesign.activity.base.BaseActivity;

/**
 * @description 仿知乎的ToolBar
 * @author openoter
 * @date 2016/10/1
 */
public class ToolbarZhiHu extends BaseActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_toolbar_layout_zh);

        toolbar = (Toolbar) findViewById(R.id.tb_toolbar);

        toolbar.setNavigationIcon(R.drawable.icon_nav_more);

        toolbar.setLogo(R.drawable.icon_logo);
        toolbar.setTitle(R.string.zhi_hu);
        toolbar.setTitleTextColor(Color.parseColor("#FF4081"));
        toolbar.inflateMenu(R.menu.toolbar_menu);

    }
}
