package han.kunpeng.graphics;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * PracticeActivity
 *
 * @author William Han
 * @date 2017/11/10
 */
public class PracticeActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    List<PageModel> pageModels = new ArrayList<>();

    {
        pageModels.add(new PageModel(R.string.title_draw_color, R.layout.view_color));
        pageModels.add(new PageModel(R.string.title_draw_circle, R.layout.view_circle));
        pageModels.add(new PageModel(R.string.title_draw_rect, R.layout.view_rect));
        pageModels.add(new PageModel(R.string.title_draw_point, R.layout.view_point));
        pageModels.add(new PageModel(R.string.title_draw_oval, R.layout.view_oval));
        pageModels.add(new PageModel(R.string.title_draw_line, R.layout.view_line));
        pageModels.add(new PageModel(R.string.title_draw_rect_round, R.layout.view_rect_round));
        pageModels.add(new PageModel(R.string.title_draw_arc, R.layout.view_arc));
        pageModels.add(new PageModel(R.string.title_draw_path, R.layout.view_path));
        pageModels.add(new PageModel(R.string.title_draw_histogram, R.layout.view_histogram));
        pageModels.add(new PageModel(R.string.title_draw_chart_pie, R.layout.view_chart_pie));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);
                return PageFragment.newInstance(pageModel.layoutRes);
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getString(pageModels.get(position).titleRes);
            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private class PageModel {
        int titleRes;
        int layoutRes;

        PageModel(int titleRes, int layoutRes) {
            this.titleRes = titleRes;
            this.layoutRes = layoutRes;
        }
    }
}
