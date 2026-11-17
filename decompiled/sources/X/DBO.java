package X;

import android.app.Activity;
import com.facebook.aura.qpl.AuraStartupDeviceState;
import com.facebook.quicklog.MarkerEditor;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class DBO extends AbstractC7559F3s implements G0U<MarkerEditor, Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ boolean $interruptedBgStart;
    public final /* synthetic */ long $timeSinceAppLaunch;
    public final /* synthetic */ DBJ<ColdInfo> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (JZLX/DBJ<TColdInfo;>;Landroid/app/Activity;)V */
    public DBO(Activity activity, DBJ dbj, long j, boolean z) {
        super(1);
        this.$timeSinceAppLaunch = j;
        this.$interruptedBgStart = z;
        this.this$0 = dbj;
        this.$activity = activity;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(MarkerEditor markerEditor) {
        MarkerEditor markerEditorA01 = AbstractC7559F3s.A01(markerEditor);
        markerEditorA01.annotate(DBJ.WARM_START_TIME_SINCE_APP_LAUNCH_TAG, this.$timeSinceAppLaunch);
        if (this.$interruptedBgStart) {
            markerEditorA01.annotate(DBJ.INTERRUPTED_BG_START_ANNOTATION, true);
        }
        AuraStartupDeviceState.INSTANCE.annotateStart(markerEditorA01);
        return Unit.INSTANCE;
    }
}
