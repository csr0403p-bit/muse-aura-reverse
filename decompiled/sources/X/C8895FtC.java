package X;

import android.content.Context;
import android.os.Bundle;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import kotlin.Unit;

/* renamed from: X.FtC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8895FtC extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8895FtC(Object obj, GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int i, Bundle bundle, HtJ<? super C8895FtC> htJ) {
        super(2, i);
        this.$t = htJ;
        this.A05 = context;
        this.A03 = obj;
        this.A02 = bundle;
        this.A04 = glanceAppWidgetReceiver;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        int i;
        Object obj3;
        int i2;
        int i3 = this.$t;
        Object obj4 = this.A05;
        if (i3 != 0) {
            obj3 = this.A04;
            i = this.A02;
            obj2 = this.A03;
            i2 = 1;
        } else {
            obj2 = this.A03;
            i = this.A02;
            obj3 = this.A04;
            i2 = 0;
        }
        C8895FtC c8895FtC = new C8895FtC(obj2, obj3, obj4, htJ, i, i2);
        c8895FtC.A01 = obj;
        return c8895FtC;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.$t
            if (r0 == 0) goto L76
            java.lang.Object r4 = r8.A01
            X.3UX r4 = (X.C3UX) r4
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L4b
            X.Hwg.A00(r9)
        L12:
            java.lang.Object r5 = r8.A05
            X.GXD r5 = (X.GXD) r5
            r0 = 0
            X.GXD.A0F(r5, r0)
        L1a:
            java.lang.Object r6 = r8.A04
            X.GXX r6 = (X.GXX) r6
            X.GY1 r0 = new X.GY1
            r0.<init>(r6)
            X.GXD.A0B(r0, r5)
            X.GXX r0 = X.GXX.A05
            if (r6 == r0) goto L2d
            X.GXD.A0D(r5)
        L2d:
            X.78T r0 = r4.AEA()
            X.HzC r0 = X.Hxb.A02(r0)
            java.lang.Object r4 = r8.A03
            android.media.AudioDeviceInfo r4 = (android.media.AudioDeviceInfo) r4
            int r8 = r8.A02
            r7 = 0
            com.facebook.rtc.audiolite.RtcAudioOutputManagerImplV2$changeAudio$1$2 r3 = new com.facebook.rtc.audiolite.RtcAudioOutputManagerImplV2$changeAudio$1$2
            r3.<init>(r4, r5, r6, r7, r8)
            X.Hqc r0 = X.AnonymousClass001.A11(r3, r0)
            X.GXD.A0F(r5, r0)
        L48:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L4b:
            X.Hwg.A00(r9)
            java.lang.Object r5 = r8.A05
            X.GXD r5 = (X.GXD) r5
            X.HoC r0 = X.GXD.A07(r5)
            if (r0 == 0) goto L1a
            boolean r0 = r0.isActive()
            if (r0 != r3) goto L1a
            X.GXn r1 = r5.A09
            java.lang.String r0 = "changeAudio: cancelling previous setCommunicationDeviceJob"
            X.InterfaceC9648GXn.A00(r1, r0)
            X.HoC r0 = X.GXD.A07(r5)
            if (r0 == 0) goto L12
            r8.A01 = r4
            r8.A00 = r3
            java.lang.Object r0 = X.HzS.A00(r8, r0)
            if (r0 != r2) goto L12
            return r2
        L76:
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r8.A00
            r0 = 1
            if (r1 == 0) goto L81
            X.Hwg.A00(r9)
            goto L48
        L81:
            X.Hwg.A00(r9)
            java.lang.Object r4 = r8.A01
            X.3UX r4 = (X.C3UX) r4
            java.lang.Object r3 = r8.A05
            androidx.glance.appwidget.GlanceAppWidgetReceiver r3 = (androidx.glance.appwidget.GlanceAppWidgetReceiver) r3
            java.lang.Object r5 = r8.A03
            android.content.Context r5 = (android.content.Context) r5
            int r6 = r8.A02
            java.lang.Object r7 = r8.A04
            android.os.Bundle r7 = (android.os.Bundle) r7
            r8.A00 = r0
            java.lang.Object r0 = r3.doOptionsChanged$glance_appwidget(r4, r5, r6, r7, r8)
            if (r0 != r2) goto L48
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8895FtC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8895FtC) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
