package androidx.glance.appwidget;

import X.A3q;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BGK;
import X.C6JZ;
import X.C6O2;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetManager$updateReceiver$2", f = "GlanceAppWidgetManager.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class GlanceAppWidgetManager$updateReceiver$2 extends AbstractC07127nr implements G0V<Preferences, HtJ<? super Preferences>, Object> {
    public final /* synthetic */ String $providerName;
    public final /* synthetic */ String $receiverName;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$updateReceiver$2(String str, String str2, HtJ<? super GlanceAppWidgetManager$updateReceiver$2> htJ) {
        super(2, htJ);
        this.$receiverName = str;
        this.$providerName = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        GlanceAppWidgetManager$updateReceiver$2 glanceAppWidgetManager$updateReceiver$2 = new GlanceAppWidgetManager$updateReceiver$2(this.$receiverName, this.$providerName, htJ);
        glanceAppWidgetManager$updateReceiver$2.L$0 = obj;
        return glanceAppWidgetManager$updateReceiver$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        Preferences preferences = (Preferences) this.L$0;
        C6O2 c6o2A04 = preferences.A04();
        String str = this.$receiverName;
        String str2 = this.$providerName;
        C6JZ<Set<String>> c6jz = GlanceAppWidgetManager.A04;
        Set set = (Set) preferences.A06(c6jz);
        if (set == null) {
            set = A3q.A00;
        }
        c6o2A04.A08(c6jz, BGK.A02(str, set));
        c6o2A04.A08(new C6JZ(FGI.A0M("provider:", str)), str2);
        return c6o2A04.A05();
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Preferences preferences, HtJ<? super Preferences> htJ) {
        return ((GlanceAppWidgetManager$updateReceiver$2) AbstractC07127nr.A09(htJ, preferences, this)).invokeSuspend(Unit.INSTANCE);
    }
}
