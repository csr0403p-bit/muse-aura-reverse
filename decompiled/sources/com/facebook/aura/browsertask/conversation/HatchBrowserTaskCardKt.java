package com.facebook.aura.browsertask.conversation;

import X.ARL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BRg;
import X.C0dx;
import X.C10G;
import X.C1BO;
import X.C1HY;
import X.C1er;
import X.C2135Az3;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.C78e;
import X.F2N;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskScreenshot;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchBrowserTaskCardKt {
    public static final float BrowserTaskPreviewDecodeSize = 400.0f;

    /* renamed from: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$BrowserTaskCardPreview$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ boolean $isPresented;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ BrowserTaskPresentationStore $presentation;
        public final /* synthetic */ String $screenshotUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BrowserTaskPresentationStore browserTaskPresentationStore, String str, boolean z, BRg bRg, ARL arl, int i, int i2) {
            super(2);
            this.$presentation = browserTaskPresentationStore;
            this.$screenshotUrl = str;
            this.$isPresented = z;
            this.$modifier = bRg;
            this.$contentScale = arl;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchBrowserTaskCardKt.BrowserTaskCardPreview(this.$presentation, this.$screenshotUrl, this.$isPresented, this.$modifier, this.$contentScale, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $browserTaskId;
        public final /* synthetic */ BrowserTaskDisplayStatus $displayState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BrowserTaskDisplayStatus browserTaskDisplayStatus, int i) {
            super(2);
            this.$browserTaskId = str;
            this.$displayState = browserTaskDisplayStatus;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchBrowserTaskCardKt.BrowserTaskStateHapticEffect(this.$browserTaskId, this.$displayState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$OtherDeviceTaskPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C109932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BrowserTaskPresentation $browserTask;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ BrowserTaskPresentationStore $presentation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109932(BrowserTaskPresentation browserTaskPresentation, BrowserTaskPresentationStore browserTaskPresentationStore, BRg bRg, int i, int i2) {
            super(2);
            this.$browserTask = browserTaskPresentation;
            this.$presentation = browserTaskPresentationStore;
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
            HatchBrowserTaskCardKt.OtherDeviceTaskPreview(this.$browserTask, this.$presentation, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final BRg topAlignedWidthFill(BRg bRg, BrowserTaskScreenshot browserTaskScreenshot) {
        return BJe.A00(C10G.A01(C2VU.A05, AnonymousClass001.A0R(bRg), true), browserTaskScreenshot.width / browserTaskScreenshot.height, false);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserTaskDisplayStatus.values().length];
            try {
                AnonymousClass002.A13(BrowserTaskDisplayStatus.COMPLETED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserTaskDisplayStatus.WAITING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserTaskDisplayStatus.NEEDS_YOU, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BrowserTaskDisplayStatus.QUEUED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(BrowserTaskDisplayStatus.STARTING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(BrowserTaskDisplayStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(BrowserTaskDisplayStatus.PAUSED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(BrowserTaskDisplayStatus.FAILED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(BrowserTaskDisplayStatus.STOPPED, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BrowserTaskCardPreview(com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore r25, java.lang.String r26, boolean r27, X.BRg r28, X.ARL r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt.BrowserTaskCardPreview(com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore, java.lang.String, boolean, X.BRg, X.ARL, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* renamed from: HatchBrowserTaskCard-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m301HatchBrowserTaskCardcf5BqRc(com.facebook.aura.model.BrowserTaskPresentation r32, X.BRg r33, long r34, X.C1D3 r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt.m301HatchBrowserTaskCardcf5BqRc(com.facebook.aura.model.BrowserTaskPresentation, X.BRg, long, X.1D3, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[PHI: r8
  0x005c: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String), (r8v5 java.lang.String) binds: [B:16:0x0042, B:23:0x0054, B:25:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[PHI: r8 r10
  0x0062: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:27:0x0060, B:25:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r10v3 X.BRg) = (r10v0 X.BRg), (r10v4 X.BRg) binds: [B:27:0x0060, B:25:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[PHI: r8 r10
  0x008a: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:27:0x0060, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r10v1 X.BRg) = (r10v0 X.BRg), (r10v3 X.BRg) binds: [B:27:0x0060, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OtherDeviceTaskPreview(com.facebook.aura.model.BrowserTaskPresentation r15, com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore r16, X.BRg r17, X.BFM r18, int r19, int r20) {
        /*
            r2 = r17
            r0 = -539861126(0xffffffffdfd25f7a, float:-3.0317938E19)
            r12 = r18
            r12.AgG(r0)
            r1 = r19
            r0 = r19 & 6
            if (r0 != 0) goto L9b
            boolean r0 = X.AnonymousClass004.A1X(r15, r12, r1)
            int r3 = X.AnonymousClass002.A05(r0)
            r3 = r3 | r19
        L1a:
            r0 = r19 & 48
            r7 = r16
            if (r0 != 0) goto L29
            boolean r0 = X.AnonymousClass004.A1Y(r7, r12, r1)
            int r0 = X.AnonymousClass002.A06(r0)
            r3 = r3 | r0
        L29:
            r19 = r20
            r4 = r20 & 4
            if (r4 == 0) goto L91
            r3 = r3 | 384(0x180, float:5.38E-43)
        L31:
            boolean r0 = X.AnonymousClass004.A1J(r3)
            boolean r0 = X.AnonymousClass001.A1b(r0, r12, r3)
            if (r0 == 0) goto L8d
            if (r4 == 0) goto L3f
            X.BS0 r2 = X.BRg.A00
        L3f:
            com.facebook.aura.model.BrowserTaskScreenshot r6 = r15.latestScreenshot
            r8 = 0
            if (r6 == 0) goto L5c
            int r4 = r6.width
            if (r4 <= 0) goto L51
            int r0 = r6.height
            int r5 = r0 * 3
            int r4 = r4 * 4
            r0 = r6
            if (r5 > r4) goto L52
        L51:
            r0 = r8
        L52:
            java.lang.String r8 = r6.url
            if (r0 == 0) goto L5c
            X.BRg r10 = topAlignedWidthFill(r2, r0)
            if (r10 != 0) goto L62
        L5c:
            X.BRg r10 = X.AnonymousClass001.A0T(r2)
            if (r6 == 0) goto L8a
        L62:
            java.lang.Boolean r0 = isPortrait(r6)
            if (r0 == 0) goto L8a
            X.ARL r11 = X.B18.A00
        L6a:
            int r0 = com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore.$stable
            r13 = r0 | 384(0x180, float:5.38E-43)
            int r0 = r3 >> 3
            r0 = r0 & 14
            r13 = r13 | r0
            r9 = 0
            r14 = r9
            BrowserTaskCardPreview(r7, r8, r9, r10, r11, r12, r13, r14)
        L78:
            X.BBb r0 = r12.AAc()
            if (r0 == 0) goto L89
            com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$OtherDeviceTaskPreview$2 r14 = new com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt$OtherDeviceTaskPreview$2
            r18 = r1
            r17 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r0.A06 = r14
        L89:
            return
        L8a:
            X.ARL r11 = X.B18.A02
            goto L6a
        L8d:
            r12.Afo()
            goto L78
        L91:
            r0 = r1 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L31
            int r0 = X.AnonymousClass004.A0f(r12, r2)
            r3 = r3 | r0
            goto L31
        L9b:
            r3 = r1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.conversation.HatchBrowserTaskCardKt.OtherDeviceTaskPreview(com.facebook.aura.model.BrowserTaskPresentation, com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore, X.BRg, X.BFM, int, int):void");
    }

    public static final Boolean isPortrait(BrowserTaskScreenshot browserTaskScreenshot) {
        int i;
        int i2 = browserTaskScreenshot.width;
        if (i2 <= 0 || (i = browserTaskScreenshot.height) <= 0) {
            return null;
        }
        return Boolean.valueOf(i > i2);
    }

    public static final void logOpenBrowserClick(HatchScreen hatchScreen, String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.OPEN_BROWSER_BUTTON, null, AnonymousClass006.A11(HatchMetadataKey.BROWSER_TASK_ID.getValue(), str, map), null);
    }

    public static final void BrowserTaskStateHapticEffect(String str, BrowserTaskDisplayStatus browserTaskDisplayStatus, BFM bfm, int i) {
        bfm.AgG(-1852592147);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, browserTaskDisplayStatus);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            F2N f2nA00 = C1HY.A00(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, stateChangeHaptic(browserTaskDisplayStatus));
            boolean zA1O = C3cH.A1O(bfm, mutableStateA00, f2nA00, c0dxA0T);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchBrowserTaskCardKt$BrowserTaskStateHapticEffect$1$1(mutableStateA00, f2nA00, c0dxA0T, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, str, c0dxA0T, f2nA00, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, browserTaskDisplayStatus, i);
        }
    }

    public static final /* synthetic */ C2135Az3 access$BrowserTaskStateHapticEffect$lambda$0(C1BO c1bo) {
        return (C2135Az3) c1bo.getValue();
    }

    public static final C2135Az3 stateChangeHaptic(BrowserTaskDisplayStatus browserTaskDisplayStatus) {
        int i;
        switch (browserTaskDisplayStatus.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
                return null;
            case 3:
            case 8:
                i = AuraHaptics.CONTEXT_TAP;
                break;
            case 5:
                i = AuraHaptics.SUCCESS;
                break;
            default:
                throw C3cG.A0q();
        }
        return new C2135Az3(i);
    }
}
