package com.jotangi.beipucharm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import com.stx.xhb.xbanner.XBanner;

public class HomeMainFragment extends BaseFragment implements View.OnClickListener {

    private String TAG = getClass().getSimpleName() + "(TAG)";

    private NavController controller;

    private ImageView btnShop, btnCombo, btnAr, btnMap, btnPark, btnHealthy, btnMember, btnShoppingCar;

    //banner
    private XBanner mXBanner;
    private ViewPager shopViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_main, container, false);

        initView(v);

        return v;
    }

    private void initView(View view) {

        btnShop = view.findViewById(R.id.iv_shop);
        btnShop.setOnClickListener(this);
        btnCombo = view.findViewById(R.id.iv_combo);
        btnCombo.setOnClickListener(this);
        btnAr = view.findViewById(R.id.iv_ar);
        btnAr.setOnClickListener(this);
        btnMap = view.findViewById(R.id.iv_map);
        btnMap.setOnClickListener(this);
        btnPark = view.findViewById(R.id.iv_park);
        btnPark.setOnClickListener(this);
        btnHealthy = view.findViewById(R.id.iv_healthy);
        btnHealthy.setOnClickListener(this);
        btnMember = view.findViewById(R.id.iv_member);
        btnMember.setOnClickListener(this);
        btnShoppingCar = view.findViewById(R.id.iv_shoppingCar);
        btnShoppingCar.setOnClickListener(this);
        shopViewPager = view.findViewById(R.id.vp_choose);
        shopViewPager.setClipToPadding(false);
        shopViewPager.setClipChildren(false);
        shopViewPager.setOffscreenPageLimit(3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_member:
                controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_homeMainFragment_to_accountLoginFragment);
                break;
            case R.id.iv_shoppingCar:
                controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_homeMainFragment_to_storeCartFragment);
                break;
            case R.id.iv_shop:
                controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_homeMainFragment_to_storeProductCategoryFragment);
                break;
            case R.id.iv_combo:
                Toast.makeText(getActivity(), "?????????\n????????????", Toast.LENGTH_SHORT).show();
            case R.id.iv_ar:
                Toast.makeText(getActivity(), "?????????\n????????????", Toast.LENGTH_SHORT).show();
            case R.id.iv_map:
                Toast.makeText(getActivity(), "?????????\n????????????", Toast.LENGTH_SHORT).show();
            case R.id.iv_park:
                Toast.makeText(getActivity(), "?????????\n????????????", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}