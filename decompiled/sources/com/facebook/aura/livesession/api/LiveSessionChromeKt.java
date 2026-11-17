package com.facebook.aura.livesession.api;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BCM;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C1BO;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionChromeProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LiveSessionChromeKt {

    /* renamed from: com.facebook.aura.livesession.api.LiveSessionChromeKt$LiveSessionChromeHost$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $retainedContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$retainedContent = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass002.A0B(interfaceC05151eP, i) == 0) {
                i |= AnonymousClass004.A0d(bfm, interfaceC05151eP);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                AnonymousClass001.A1G(interfaceC05151eP, bfm, this.$retainedContent, (i & 14) | 48);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.livesession.api.LiveSessionChromeKt$LiveSessionChromeHost$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$enabled = z;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            LiveSessionChromeKt.LiveSessionChromeHost(this.$modifier, this.$enabled, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.livesession.api.LiveSessionChromeKt$LiveSessionContentEffects$2, reason: invalid class name and case insensitive filesystem */
    public final class C124032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124032(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            LiveSessionChromeKt.LiveSessionContentEffects(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.livesession.api.LiveSessionChromeKt$LiveSessionFloatingLayer$2, reason: invalid class name and case insensitive filesystem */
    public final class C124042 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124042(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            LiveSessionChromeKt.LiveSessionFloatingLayer(this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void LiveSessionChromeHost(BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(g0w, 2);
        bfm.AgG(-1629520677);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = liveSessionChrome();
                bfm.Ai0(objAaT);
            }
            LiveSessionChrome liveSessionChrome = (LiveSessionChrome) objAaT;
            MutableState mutableStateA00 = C1er.A00(bfm, g0w);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = BCM.A00(B1V.A01(new LiveSessionChromeKt$LiveSessionChromeHost$retainedContent$1$1(mutableStateA00), -1190113995, true));
                bfm.Ai0(objAaT2);
            }
            G0W g0w2 = (G0W) objAaT2;
            if (liveSessionChrome == null || !z2) {
                bfm.AgE(965221131);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                AnonymousClass001.A1G(C0z7.A00, bfm, g0w2, 54);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(965286851);
                liveSessionChrome.Host(bRg2, B1V.A00(bfm, new AnonymousClass2(g0w2), -2024308340), bfm, (iA0d & 14) | 48);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, z2, g0w, i, i2);
        }
    }

    public static final LiveSessionChrome liveSessionChrome() {
        int i = new int[]{0}[0];
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            return HatchVoiceLiveSessionChromeProvider.INSTANCE.chrome();
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", numValueOf));
    }

    public static final G0W<InterfaceC05151eP, BFM, Integer, Unit> LiveSessionChromeHost$lambda$1(C1BO<? extends G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final void LiveSessionContentEffects(BFM bfm, int i) {
        bfm.AgG(-159942763);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = liveSessionChrome();
                bfm.Ai0(objAaT);
            }
            LiveSessionChrome liveSessionChrome = (LiveSessionChrome) objAaT;
            if (liveSessionChrome == null) {
                bfm.AgE(-1736051332);
            } else {
                bfm.AgE(913829669);
                liveSessionChrome.ContentEffects(bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C124032(i);
        }
    }

    public static final void LiveSessionFloatingLayer(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-286535036);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = liveSessionChrome();
                bfm.Ai0(objAaT);
            }
            LiveSessionChrome liveSessionChrome = (LiveSessionChrome) objAaT;
            if (liveSessionChrome == null) {
                bfm.AgE(-2065123608);
            } else {
                bfm.AgE(-482258887);
                liveSessionChrome.FloatingLayer(z, bRg, bfm, iA0n & 126);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C124042(z, bRg, i, i2);
        }
    }

    public static final /* synthetic */ G0W access$LiveSessionChromeHost$lambda$1(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }
}
