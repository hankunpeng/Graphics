package han.kunpeng.graphics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/**
 * PageFragment
 *
 * @author William Han
 * @date 2017/11/10
 */
public class PageFragment extends Fragment {
    int fragmentLayoutRes;

    public static PageFragment newInstance(int practiceLayoutRes) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("fragmentLayoutRes", practiceLayoutRes);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            fragmentLayoutRes = args.getInt("fragmentLayoutRes");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);

        ViewStub practiceStub = (ViewStub) view.findViewById(R.id.viewStub);
        practiceStub.setLayoutResource(fragmentLayoutRes);
        practiceStub.inflate();

        return view;
    }
}
