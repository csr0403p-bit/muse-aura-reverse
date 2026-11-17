package X;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Ftn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8931Ftn implements FT4 {
    public final int $t;
    public final Object A00;

    public C8931Ftn(AbstractC8571FgQ abstractC8571FgQ, int i) {
        this.$t = i;
        this.A00 = abstractC8571FgQ;
    }

    @Override // X.FT4
    public final /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
        ActivityResult activityResult;
        String str;
        String str2;
        int i;
        Fragment fragmentA01;
        String str3;
        String str4;
        StringBuilder sbA0x;
        switch (this.$t) {
            case 0:
                Map map = (Map) obj;
                map.keySet().toArray(new String[0]);
                ArrayList arrayListA0t = BV4.A0t(map.values());
                arrayListA0t.size();
                for (int i2 = 0; i2 < arrayListA0t.size(); i2++) {
                    arrayListA0t.get(i2);
                }
                AbstractC8571FgQ abstractC8571FgQ = (AbstractC8571FgQ) this.A00;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfoPollFirst = abstractC8571FgQ.A0C.pollFirst();
                str = "FragmentManager";
                if (fragmentManager$LaunchedFragmentInfoPollFirst == null) {
                    str4 = "No permissions were requested for ";
                    sbA0x = C3cG.A0f(this, str4);
                    Log.w(str, sbA0x.toString());
                    break;
                } else {
                    str2 = fragmentManager$LaunchedFragmentInfoPollFirst.A01;
                    if (abstractC8571FgQ.A0U.A01(str2) == null) {
                        str3 = "Permission request result delivered for unknown Fragment ";
                        sbA0x = C3cI.A0x(str3, str2);
                        Log.w(str, sbA0x.toString());
                    }
                }
                break;
            case 1:
                activityResult = (ActivityResult) obj;
                AbstractC8571FgQ abstractC8571FgQ2 = (AbstractC8571FgQ) this.A00;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfoPollLast = abstractC8571FgQ2.A0C.pollLast();
                str = "FragmentManager";
                if (fragmentManager$LaunchedFragmentInfoPollLast == null) {
                    str4 = "No Activities were started for result for ";
                    sbA0x = C3cG.A0f(this, str4);
                    Log.w(str, sbA0x.toString());
                    break;
                } else {
                    str2 = fragmentManager$LaunchedFragmentInfoPollLast.A01;
                    i = fragmentManager$LaunchedFragmentInfoPollLast.A00;
                    fragmentA01 = abstractC8571FgQ2.A0U.A01(str2);
                    if (fragmentA01 == null) {
                        str3 = "Activity result delivered for unknown Fragment ";
                        sbA0x = C3cI.A0x(str3, str2);
                        Log.w(str, sbA0x.toString());
                    }
                    fragmentA01.onActivityResult(i, activityResult.A00, activityResult.A01);
                    break;
                }
            default:
                activityResult = (ActivityResult) obj;
                AbstractC8571FgQ abstractC8571FgQ3 = (AbstractC8571FgQ) this.A00;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfoPollFirst2 = abstractC8571FgQ3.A0C.pollFirst();
                str = "FragmentManager";
                if (fragmentManager$LaunchedFragmentInfoPollFirst2 == null) {
                    str4 = "No IntentSenders were started for ";
                    sbA0x = C3cG.A0f(this, str4);
                    Log.w(str, sbA0x.toString());
                    break;
                } else {
                    str2 = fragmentManager$LaunchedFragmentInfoPollFirst2.A01;
                    i = fragmentManager$LaunchedFragmentInfoPollFirst2.A00;
                    fragmentA01 = abstractC8571FgQ3.A0U.A01(str2);
                    if (fragmentA01 == null) {
                        str3 = "Intent Sender result delivered for unknown Fragment ";
                        sbA0x = C3cI.A0x(str3, str2);
                        Log.w(str, sbA0x.toString());
                    }
                    fragmentA01.onActivityResult(i, activityResult.A00, activityResult.A01);
                    break;
                }
        }
    }
}
