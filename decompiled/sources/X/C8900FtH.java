package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import kotlin.Unit;

/* renamed from: X.FtH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8900FtH extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public boolean A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8900FtH(Context context, HtJ<? super C8900FtH> htJ) {
        super(2, htJ);
        this.$t = 0;
        this.A02 = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        boolean z;
        int i;
        switch (this.$t) {
            case 0:
                C8900FtH c8900FtH = new C8900FtH((Context) this.A02, htJ);
                c8900FtH.A01 = AnonymousClass001.A1X(obj);
                return c8900FtH;
            case 1:
                obj2 = this.A02;
                z = this.A01;
                i = 1;
                break;
            default:
                obj2 = this.A02;
                z = this.A01;
                i = 2;
                break;
        }
        return new C8900FtH(obj2, htJ, i, z);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                boolean z = this.A01;
                Context context = (Context) this.A02;
                C7384Etj.A0Y(context, 0);
                PackageManager packageManager = context.getPackageManager();
                C7384Etj.A0U(packageManager);
                F3S.A00(new ComponentName(context, (Class<?>) RescheduleReceiver.class), packageManager, F3m.A00, z);
                break;
            case 1:
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = (MetaAiRsysSdkRealTimeSession) this.A02;
                    this.A00 = 1;
                    if (MetaAiRsysSdkRealTimeSession.A03(metaAiRsysSdkRealTimeSession, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                EnableAudioParameters enableAudioParameters = new EnableAudioParameters(HatchPriceImpressionEventDataKt.NO_DISCOUNT, 9, this.A01);
                C9591GQq c9591GQq = ((MetaAiRsysSdkRealTimeSession) this.A02).A0C;
                FZS fzsA02 = FZS.A02(enableAudioParameters, 39);
                GR9 gr9 = c9591GQq.A0C;
                if (gr9 == null) {
                    AbstractC7608F5v.A1L("EnableAudioParameters called before call object is available. Caching the action to execute later");
                    c9591GQq.A01.A01.add(fzsA02);
                    break;
                } else {
                    fzsA02.invoke(gr9);
                    break;
                }
            default:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                GXF gxf = (GXF) this.A02;
                boolean z2 = gxf.A04;
                boolean z3 = this.A01;
                if (z2 == z3) {
                    GXF.A00(gxf, z3);
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8900FtH) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8900FtH(Object obj, MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, boolean z, HtJ<? super C8900FtH> htJ) {
        super(2, metaAiRsysSdkRealTimeSession);
        this.$t = z ? 1 : 0;
        this.A02 = obj;
        this.A01 = htJ;
    }
}
