package test.bwie.com.jiajianhai20170509.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import test.bwie.com.jiajianhai20170509.R;
import test.bwie.com.jiajianhai20170509.fragment.Fragmenttwo;
import test.bwie.com.jiajianhai20170509.fragment.Framgent10;
import test.bwie.com.jiajianhai20170509.fragment.Framgent3;
import test.bwie.com.jiajianhai20170509.fragment.Framgent4;
import test.bwie.com.jiajianhai20170509.fragment.Framgent5;
import test.bwie.com.jiajianhai20170509.fragment.Framgent6;
import test.bwie.com.jiajianhai20170509.fragment.Framgent7;
import test.bwie.com.jiajianhai20170509.fragment.Framgent8;
import test.bwie.com.jiajianhai20170509.fragment.Framgent9;
import test.bwie.com.jiajianhai20170509.fragment.Framgentone;

public class MainActivity extends FragmentActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<Fragment> list_f;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();

    }

    private void initview() {
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());

        list = new ArrayList<>();
        list.add("number1");
        list.add("number2");
        list.add("number3");
        list.add("number4");
        list.add("number5");
        list.add("number6");
        list.add("number7");
        list.add("number8");
        list.add("number9");
        list.add("number10");


        tabLayout.addTab(tabLayout.newTab().setText(list.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(3)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(4)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(5)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(6)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(7)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(8)));
        tabLayout.addTab(tabLayout.newTab().setText(list.get(9)));

        Framgentone one = new Framgentone();
        Fragmenttwo two = new Fragmenttwo();
        Framgent3 f3 = new Framgent3();
        Framgent4 f4 = new Framgent4();
        Framgent5 f5 = new Framgent5();
        Framgent6 f6 = new Framgent6();
        Framgent7 f7 = new Framgent7();
        Framgent8 f8 = new Framgent8();
        Framgent9 f9 = new Framgent9();
        Framgent10 f10 = new Framgent10();
        list_f = new ArrayList<>();
        list_f.add(one);
        list_f.add(two);
        list_f.add(f3);
        list_f.add(f4);
        list_f.add(f5);
        list_f.add(f6);
        list_f.add(f7);
        list_f.add(f8);
        list_f.add(f9);
        list_f.add(f10);


        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(adapter);
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list_f.get(position);
        }

        @Override
        public int getCount() {
            return list_f.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return list.get(position);
        }
    }
}
