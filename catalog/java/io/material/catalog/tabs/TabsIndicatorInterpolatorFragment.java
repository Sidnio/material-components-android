package io.material.catalog.tabs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;

import com.google.android.material.tabs.TabLayout;

import io.material.catalog.R;
import io.material.catalog.feature.DemoFragment;

public class TabsIndicatorInterpolatorFragment extends DemoFragment {

  private TabLayout tabLayout;

  @Override
  public View onCreateDemoView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    View view = layoutInflater.inflate(getTabsContent(), viewGroup, /* attachToRoot= */ false);
    tabLayout = view.findViewById(R.id.indicator_interpolator_tabLayout);
    Button okButton = view.findViewById(R.id.indicator_interpolator_ok_button);
    EditText editText = view.findViewById(R.id.indicator_interpolator_editTextText);

    tabLayout.setTabIndicatorAnimationMode(TabLayout.INDICATOR_ANIMATION_MODE_FADE);

    okButton.setOnClickListener(v -> {
      String string = editText.getText().toString().trim();
      if (!string.isEmpty()) {
        tabLayout.setTabIndicatorInterpolatorWidth(Integer.parseInt(string));
      }
    });

    return view;
  }


  @LayoutRes
  protected int getTabsContent() {
    return R.layout.cat_tabs_indicator_interpolator_fragment;
  }
}
