package X;

import android.content.Context;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.DlX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5594DlX implements InterfaceC5478DjF {
    public C6173DxG A00;
    public final InterfaceC4913DEg A01;
    public final C5815Dpz A02;
    public final C5595Dla A03;
    public final C5611Dlq A04;
    public final AbrContextAwareConfiguration A05;
    public final InterfaceC5683DnM A06;
    public final InterfaceC4913DEg A07;
    public final C5894Drb A08;
    public final C5693Dna A09;
    public final C5692DnZ A0A;
    public final C5685DnQ A0B;
    public final C5685DnQ A0C;
    public final C5594DlX A0D;
    public final DnP A0E;
    public final C5092DXa A0F;
    public volatile int A0G = -1;
    public volatile C6154Dwx A0H;
    public volatile C6154Dwx A0I;
    public volatile String A0J;
    public volatile boolean A0K;
    public volatile boolean A0L;
    public volatile C6154Dwx[] A0M;

    public C5594DlX(Context context, InterfaceC4913DEg interfaceC4913DEg, InterfaceC4913DEg interfaceC4913DEg2, C5815Dpz c5815Dpz, C5611Dlq c5611Dlq, C5594DlX c5594DlX, AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC5683DnM interfaceC5683DnM, C5092DXa c5092DXa) {
        InterfaceC5683DnM c5694Dnb = interfaceC5683DnM;
        interfaceC4913DEg.getClass();
        this.A01 = interfaceC4913DEg;
        this.A02 = c5815Dpz;
        this.A0F = c5092DXa;
        c5694Dnb = interfaceC5683DnM == null ? new C5694Dnb() : c5694Dnb;
        this.A06 = c5694Dnb;
        this.A04 = c5611Dlq;
        this.A0D = c5594DlX;
        this.A07 = interfaceC4913DEg2;
        C5595Dla c5595Dla = new C5595Dla(context, c5815Dpz, abrContextAwareConfiguration, c5092DXa);
        this.A03 = c5595Dla;
        this.A08 = new C5894Drb(c5595Dla);
        this.A05 = abrContextAwareConfiguration;
        this.A0E = new DnP(interfaceC4913DEg, interfaceC4913DEg2, abrContextAwareConfiguration, c5694Dnb, c5815Dpz.A02);
        this.A0A = new C5692DnZ(abrContextAwareConfiguration, c5694Dnb);
        synchronized (c5815Dpz) {
        }
        this.A09 = new C5693Dna(new C7440Ew2(C79.A0C), abrContextAwareConfiguration, c5694Dnb);
        this.A0B = new C5685DnQ(interfaceC4913DEg, abrContextAwareConfiguration, c5694Dnb);
        this.A0C = new C5685DnQ(interfaceC4913DEg, abrContextAwareConfiguration, c5694Dnb);
    }

    public static int A00(C5594DlX c5594DlX, boolean z) {
        if (z) {
            C5594DlX c5594DlX2 = c5594DlX.A0D;
            int i = c5594DlX2 != null ? c5594DlX2.A0G : c5594DlX.A0G;
            if (i >= 0) {
                return i;
            }
            C6154Dwx c6154Dwx = c5594DlX2 != null ? c5594DlX2.A0I : c5594DlX.A0I;
            if (c6154Dwx != null) {
                return c6154Dwx.A05;
            }
            AbstractC3426CMt.A03("StitchAbrEvaluator", "Didn't find a video bitrate for this audio selection", c5594DlX.A02.A01);
        }
        return 0;
    }

    private Do0 A01(boolean z) {
        boolean z2;
        C5815Dpz c5815Dpz = this.A02;
        synchronized (c5815Dpz) {
        }
        synchronized (c5815Dpz) {
            z2 = c5815Dpz.A08;
        }
        return !z2 ? this.A05.enableQoERationalGamblerAbr(z) ? this.A0B : this.A0E : this.A0A;
    }

    public final List<String> A02() {
        if (this.A0M == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (C6154Dwx c6154Dwx : this.A0M) {
            if (BV6.A0o(c6154Dwx) != null) {
                arrayListA0h.add(BV6.A0o(c6154Dwx));
            }
        }
        arrayListA0h.size();
        return arrayListA0h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0212 A[Catch: all -> 0x03e6, TryCatch #3 {all -> 0x03e6, blocks: (B:119:0x01fe, B:122:0x0206, B:124:0x0212, B:127:0x021b, B:130:0x0225, B:159:0x02a0, B:131:0x0229, B:133:0x0237, B:135:0x023b, B:137:0x0243, B:139:0x0249, B:141:0x024d, B:142:0x0252, B:143:0x025a, B:152:0x0271, B:162:0x02a8, B:164:0x02c7, B:167:0x02d0, B:169:0x0300, B:187:0x0355, B:188:0x03ba, B:190:0x03c5, B:171:0x0304, B:173:0x0308, B:184:0x034e, B:195:0x03d2, B:196:0x03d5, B:151:0x026b, B:197:0x03d6, B:174:0x030d, B:176:0x0325, B:179:0x032d, B:181:0x0349, B:183:0x034d, B:192:0x03cf, B:193:0x03d0, B:182:0x034a), top: B:499:0x01fe, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c7 A[Catch: all -> 0x03e6, TRY_LEAVE, TryCatch #3 {all -> 0x03e6, blocks: (B:119:0x01fe, B:122:0x0206, B:124:0x0212, B:127:0x021b, B:130:0x0225, B:159:0x02a0, B:131:0x0229, B:133:0x0237, B:135:0x023b, B:137:0x0243, B:139:0x0249, B:141:0x024d, B:142:0x0252, B:143:0x025a, B:152:0x0271, B:162:0x02a8, B:164:0x02c7, B:167:0x02d0, B:169:0x0300, B:187:0x0355, B:188:0x03ba, B:190:0x03c5, B:171:0x0304, B:173:0x0308, B:184:0x034e, B:195:0x03d2, B:196:0x03d5, B:151:0x026b, B:197:0x03d6, B:174:0x030d, B:176:0x0325, B:179:0x032d, B:181:0x0349, B:183:0x034d, B:192:0x03cf, B:193:0x03d0, B:182:0x034a), top: B:499:0x01fe, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0325 A[Catch: all -> 0x03d1, TryCatch #1 {all -> 0x03d1, blocks: (B:174:0x030d, B:176:0x0325, B:179:0x032d, B:181:0x0349, B:183:0x034d, B:192:0x03cf, B:193:0x03d0, B:182:0x034a), top: B:495:0x030d, outer: #3, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    @Override // X.InterfaceC5478DjF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ABe(X.C5505Djh r73, X.EnumC5744Dof r74, final X.C5467Dj2 r75, java.lang.Integer r76, final java.lang.Object r77, java.util.Map r78, X.C6154Dwx[] r79, X.C6154Dwx[] r80, float r81, long r82, long r84, long r86) {
        /*
            Method dump skipped, instructions count: 2353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5594DlX.ABe(X.Djh, X.Dof, X.Dj2, java.lang.Integer, java.lang.Object, java.util.Map, X.Dwx[], X.Dwx[], float, long, long, long):void");
    }
}
