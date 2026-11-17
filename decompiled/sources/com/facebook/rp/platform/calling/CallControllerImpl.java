package com.facebook.rp.platform.calling;

import X.AnonymousClass005;
import X.BV5;
import X.C5048DQu;
import X.C5322DgG;
import X.C8630Fhh;
import X.F0C;
import X.FZO;
import X.G0V;
import X.GTU;
import X.GTf;
import X.GTn;
import X.GV7;
import X.GVk;
import X.GWq;
import X.HxE;
import android.content.Context;
import com.facebook.aura.partners.voice.session.impl.HatchCallControllerConfig;
import com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$mcProvider$1;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class CallControllerImpl implements GTf {
    public AudioModule A00;
    public GVk A01;
    public GWq A02;
    public final Context A03;
    public final HatchCallControllerConfig A04;
    public final HatchRealTimeSessionController$mcProvider$1 A05;
    public final Map<String, HxE<ConnectFunnelProxy, GV7>> A06;
    public final F0C A07;
    public final Function0<C5048DQu> A08;
    public final G0V<Context, GTn, GVk> A09;

    public /* synthetic */ CallControllerImpl(Context context, HatchCallControllerConfig hatchCallControllerConfig, HatchRealTimeSessionController$mcProvider$1 hatchRealTimeSessionController$mcProvider$1, Function0 function0) {
        C8630Fhh c8630Fhh = new C8630Fhh(9);
        AnonymousClass005.A14(context, hatchCallControllerConfig, hatchRealTimeSessionController$mcProvider$1, function0);
        this.A03 = context;
        this.A04 = hatchCallControllerConfig;
        this.A05 = hatchRealTimeSessionController$mcProvider$1;
        this.A08 = function0;
        this.A09 = c8630Fhh;
        this.A06 = BV5.A14();
        this.A07 = C5322DgG.A01((Function0) FZO.A02(this, 33));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // X.GTf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ahl(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r3 = 10
            boolean r0 = r8 instanceof X.C8912FtU
            if (r0 == 0) goto L58
            r5 = r8
            X.FtU r5 = (X.C8912FtU) r5
            int r0 = r5.$t
            if (r0 != r3) goto L58
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r1 = r5.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L5e
            java.lang.Object r7 = r5.A01
            X.Hwg.A00(r1)
        L28:
            java.util.Map<java.lang.String, X.HxE<com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy, X.GV7>> r0 = r6.A06
            r0.remove(r7)
        L2d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L30:
            X.Hwg.A00(r1)
            X.GVk r2 = r6.A01
            if (r2 != 0) goto L3d
            java.lang.String r0 = "unregisterUser while didn't call registerUser before"
            X.AbstractC7608F5v.A1L(r0)
            goto L2d
        L3d:
            java.lang.String r0 = "unregisterUser userId="
            java.lang.String r0 = X.FGI.A0M(r0, r7)
            r1 = 0
            X.C7384Etj.A0Y(r0, r3)
            X.AbstractC7608F5v.A1L(r0)
            com.facebook.aura.partners.voice.session.impl.HatchCallControllerConfig r0 = r6.A04
            java.lang.String r0 = r0.appId
            X.C8912FtU.A00(r7, r1, r5, r3)
            java.lang.Object r0 = r2.Ahm(r7, r0, r5)
            if (r0 != r4) goto L28
            return r4
        L58:
            X.FtU r5 = new X.FtU
            r5.<init>(r6, r8, r3)
            goto L18
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.calling.CallControllerImpl.Ahl(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.GTS
    public final GTU getAppConfig() {
        return new GTU();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[Catch: all -> 0x03e2, TryCatch #0 {all -> 0x03e2, all -> 0x03dd, blocks: (B:121:0x03a3, B:122:0x03a6, B:124:0x03aa, B:126:0x03b6, B:128:0x03bd, B:15:0x0041, B:17:0x0045, B:20:0x004d, B:138:0x03e1, B:21:0x0052, B:23:0x006e, B:25:0x00b6, B:28:0x00be, B:30:0x00c2, B:31:0x00c6, B:33:0x00cc, B:35:0x00d7, B:36:0x00db, B:37:0x00e4, B:39:0x00e8, B:40:0x00ed, B:42:0x00f3, B:44:0x0111, B:46:0x0117, B:50:0x0166, B:47:0x011f, B:49:0x0155, B:53:0x016f, B:55:0x0175, B:57:0x017b, B:58:0x0180, B:61:0x018d, B:63:0x019a, B:65:0x019e, B:66:0x01a5, B:71:0x01b4, B:79:0x01ee, B:80:0x01f4, B:78:0x01e2, B:81:0x01fd, B:82:0x01ff, B:84:0x0279, B:86:0x027d, B:88:0x0286, B:89:0x0290, B:91:0x02bb, B:92:0x02d9, B:94:0x02df, B:95:0x02e2, B:118:0x038d, B:137:0x03de, B:59:0x0183, B:133:0x03ca, B:134:0x03cf, B:135:0x03d6, B:96:0x031c, B:98:0x0332, B:99:0x0340, B:101:0x0349, B:103:0x034d, B:104:0x034f, B:106:0x0353, B:108:0x035e, B:110:0x0364, B:115:0x0375, B:113:0x0370, B:116:0x037e, B:107:0x035b, B:117:0x0386), top: B:142:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[Catch: all -> 0x03e2, TryCatch #0 {all -> 0x03e2, all -> 0x03dd, blocks: (B:121:0x03a3, B:122:0x03a6, B:124:0x03aa, B:126:0x03b6, B:128:0x03bd, B:15:0x0041, B:17:0x0045, B:20:0x004d, B:138:0x03e1, B:21:0x0052, B:23:0x006e, B:25:0x00b6, B:28:0x00be, B:30:0x00c2, B:31:0x00c6, B:33:0x00cc, B:35:0x00d7, B:36:0x00db, B:37:0x00e4, B:39:0x00e8, B:40:0x00ed, B:42:0x00f3, B:44:0x0111, B:46:0x0117, B:50:0x0166, B:47:0x011f, B:49:0x0155, B:53:0x016f, B:55:0x0175, B:57:0x017b, B:58:0x0180, B:61:0x018d, B:63:0x019a, B:65:0x019e, B:66:0x01a5, B:71:0x01b4, B:79:0x01ee, B:80:0x01f4, B:78:0x01e2, B:81:0x01fd, B:82:0x01ff, B:84:0x0279, B:86:0x027d, B:88:0x0286, B:89:0x0290, B:91:0x02bb, B:92:0x02d9, B:94:0x02df, B:95:0x02e2, B:118:0x038d, B:137:0x03de, B:59:0x0183, B:133:0x03ca, B:134:0x03cf, B:135:0x03d6, B:96:0x031c, B:98:0x0332, B:99:0x0340, B:101:0x0349, B:103:0x034d, B:104:0x034f, B:106:0x0353, B:108:0x035e, B:110:0x0364, B:115:0x0375, B:113:0x0370, B:116:0x037e, B:107:0x035b, B:117:0x0386), top: B:142:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117 A[Catch: all -> 0x03e2, TryCatch #0 {all -> 0x03e2, all -> 0x03dd, blocks: (B:121:0x03a3, B:122:0x03a6, B:124:0x03aa, B:126:0x03b6, B:128:0x03bd, B:15:0x0041, B:17:0x0045, B:20:0x004d, B:138:0x03e1, B:21:0x0052, B:23:0x006e, B:25:0x00b6, B:28:0x00be, B:30:0x00c2, B:31:0x00c6, B:33:0x00cc, B:35:0x00d7, B:36:0x00db, B:37:0x00e4, B:39:0x00e8, B:40:0x00ed, B:42:0x00f3, B:44:0x0111, B:46:0x0117, B:50:0x0166, B:47:0x011f, B:49:0x0155, B:53:0x016f, B:55:0x0175, B:57:0x017b, B:58:0x0180, B:61:0x018d, B:63:0x019a, B:65:0x019e, B:66:0x01a5, B:71:0x01b4, B:79:0x01ee, B:80:0x01f4, B:78:0x01e2, B:81:0x01fd, B:82:0x01ff, B:84:0x0279, B:86:0x027d, B:88:0x0286, B:89:0x0290, B:91:0x02bb, B:92:0x02d9, B:94:0x02df, B:95:0x02e2, B:118:0x038d, B:137:0x03de, B:59:0x0183, B:133:0x03ca, B:134:0x03cf, B:135:0x03d6, B:96:0x031c, B:98:0x0332, B:99:0x0340, B:101:0x0349, B:103:0x034d, B:104:0x034f, B:106:0x0353, B:108:0x035e, B:110:0x0364, B:115:0x0375, B:113:0x0370, B:116:0x037e, B:107:0x035b, B:117:0x0386), top: B:142:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155 A[Catch: all -> 0x03e2, TryCatch #0 {all -> 0x03e2, all -> 0x03dd, blocks: (B:121:0x03a3, B:122:0x03a6, B:124:0x03aa, B:126:0x03b6, B:128:0x03bd, B:15:0x0041, B:17:0x0045, B:20:0x004d, B:138:0x03e1, B:21:0x0052, B:23:0x006e, B:25:0x00b6, B:28:0x00be, B:30:0x00c2, B:31:0x00c6, B:33:0x00cc, B:35:0x00d7, B:36:0x00db, B:37:0x00e4, B:39:0x00e8, B:40:0x00ed, B:42:0x00f3, B:44:0x0111, B:46:0x0117, B:50:0x0166, B:47:0x011f, B:49:0x0155, B:53:0x016f, B:55:0x0175, B:57:0x017b, B:58:0x0180, B:61:0x018d, B:63:0x019a, B:65:0x019e, B:66:0x01a5, B:71:0x01b4, B:79:0x01ee, B:80:0x01f4, B:78:0x01e2, B:81:0x01fd, B:82:0x01ff, B:84:0x0279, B:86:0x027d, B:88:0x0286, B:89:0x0290, B:91:0x02bb, B:92:0x02d9, B:94:0x02df, B:95:0x02e2, B:118:0x038d, B:137:0x03de, B:59:0x0183, B:133:0x03ca, B:134:0x03cf, B:135:0x03d6, B:96:0x031c, B:98:0x0332, B:99:0x0340, B:101:0x0349, B:103:0x034d, B:104:0x034f, B:106:0x0353, B:108:0x035e, B:110:0x0364, B:115:0x0375, B:113:0x0370, B:116:0x037e, B:107:0x035b, B:117:0x0386), top: B:142:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166 A[Catch: all -> 0x03e2, TRY_LEAVE, TryCatch #0 {all -> 0x03e2, all -> 0x03dd, blocks: (B:121:0x03a3, B:122:0x03a6, B:124:0x03aa, B:126:0x03b6, B:128:0x03bd, B:15:0x0041, B:17:0x0045, B:20:0x004d, B:138:0x03e1, B:21:0x0052, B:23:0x006e, B:25:0x00b6, B:28:0x00be, B:30:0x00c2, B:31:0x00c6, B:33:0x00cc, B:35:0x00d7, B:36:0x00db, B:37:0x00e4, B:39:0x00e8, B:40:0x00ed, B:42:0x00f3, B:44:0x0111, B:46:0x0117, B:50:0x0166, B:47:0x011f, B:49:0x0155, B:53:0x016f, B:55:0x0175, B:57:0x017b, B:58:0x0180, B:61:0x018d, B:63:0x019a, B:65:0x019e, B:66:0x01a5, B:71:0x01b4, B:79:0x01ee, B:80:0x01f4, B:78:0x01e2, B:81:0x01fd, B:82:0x01ff, B:84:0x0279, B:86:0x027d, B:88:0x0286, B:89:0x0290, B:91:0x02bb, B:92:0x02d9, B:94:0x02df, B:95:0x02e2, B:118:0x038d, B:137:0x03de, B:59:0x0183, B:133:0x03ca, B:134:0x03cf, B:135:0x03d6, B:96:0x031c, B:98:0x0332, B:99:0x0340, B:101:0x0349, B:103:0x034d, B:104:0x034f, B:106:0x0353, B:108:0x035e, B:110:0x0364, B:115:0x0375, B:113:0x0370, B:116:0x037e, B:107:0x035b, B:117:0x0386), top: B:142:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f A[Catch: all -> 0x03e2, TRY_ENTER, TryCatch #0 {all -> 0x03e2, all -> 0x03dd, blocks: (B:121:0x03a3, B:122:0x03a6, B:124:0x03aa, B:126:0x03b6, B:128:0x03bd, B:15:0x0041, B:17:0x0045, B:20:0x004d, B:138:0x03e1, B:21:0x0052, B:23:0x006e, B:25:0x00b6, B:28:0x00be, B:30:0x00c2, B:31:0x00c6, B:33:0x00cc, B:35:0x00d7, B:36:0x00db, B:37:0x00e4, B:39:0x00e8, B:40:0x00ed, B:42:0x00f3, B:44:0x0111, B:46:0x0117, B:50:0x0166, B:47:0x011f, B:49:0x0155, B:53:0x016f, B:55:0x0175, B:57:0x017b, B:58:0x0180, B:61:0x018d, B:63:0x019a, B:65:0x019e, B:66:0x01a5, B:71:0x01b4, B:79:0x01ee, B:80:0x01f4, B:78:0x01e2, B:81:0x01fd, B:82:0x01ff, B:84:0x0279, B:86:0x027d, B:88:0x0286, B:89:0x0290, B:91:0x02bb, B:92:0x02d9, B:94:0x02df, B:95:0x02e2, B:118:0x038d, B:137:0x03de, B:59:0x0183, B:133:0x03ca, B:134:0x03cf, B:135:0x03d6, B:96:0x031c, B:98:0x0332, B:99:0x0340, B:101:0x0349, B:103:0x034d, B:104:0x034f, B:106:0x0353, B:108:0x035e, B:110:0x0364, B:115:0x0375, B:113:0x0370, B:116:0x037e, B:107:0x035b, B:117:0x0386), top: B:142:0x0022 }] */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    @Override // X.GTS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startSession(X.GTH r38, X.HtJ<? super X.GR9> r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.calling.CallControllerImpl.startSession(X.GTH, X.HtJ):java.lang.Object");
    }
}
