package com.facebook.aura.vmbrowser.runtime;

import X.AKQ;
import X.ARD;
import X.AXN;
import X.Ab3;
import X.AbstractC1564Ale;
import X.AbstractC2271BQs;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BL4;
import X.BO4;
import X.BOI;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C0Yr;
import X.C0fG;
import X.C1515AkP;
import X.C1BO;
import X.C1DM;
import X.C1HY;
import X.C1Ny;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cH;
import X.C5303Dfm;
import X.C7384Etj;
import X.C78N;
import X.C78g;
import X.Dg3;
import X.EnumC10573Huf;
import X.EnumC3085Bxl;
import X.F2N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.browsertask.control.BrowserViewerPreference;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentBrowserLiveViewerKt {
    public static final Unit AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$0$0(C0fG c0fG, String str) {
        C7384Etj.A0Y(str, 1);
        c0fG.Aey(AnonymousClass005.A0X(str));
        return Unit.INSTANCE;
    }

    public static final View AgentBrowserLiveViewer_0vH8DBg$lambda$23$1$0(AgentBrowserSurface agentBrowserSurface, BrowserViewerSession.Host host, String str, Context context) {
        C7384Etj.A0Y(context, 3);
        return agentBrowserSurface.controller.createVncWebViewForTask(context, host.viewOnly, str, new AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$11$2$1$1(host), new AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$11$2$1$2(host));
    }

    public static final void AgentBrowserLiveViewer_0vH8DBg$lambda$6$0$0(BrowserViewerSession browserViewerSession, C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        int iA0E = AnonymousClass001.A0E(enumC3085Bxl, 2);
        boolean z = true;
        if (iA0E != 1) {
            if (iA0E != 4) {
                return;
            } else {
                z = false;
            }
        }
        browserViewerSession.noteApplicationForeground(z);
    }

    public static final void BrowserViewerPlaceholder(final boolean z, BRg bRg, BFM bfm, final int i, final int i2) {
        int i3;
        final BRg bRg2 = bRg;
        bfm.AgG(-1802571032);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).shimmeringBase;
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bRg2, c1dm, j);
            if (z) {
                bfm.AgE(-417306861);
                i3 = 0;
                BO4 bo4A01 = BOI.A01(bfm, null, auraTheme.getDimensions(bfm, 6).shimmerOffset, 220, auraTheme.getColors(bfm, 6).shimmeringBase, auraTheme.getColors(bfm, 6).shimmeringHighlight);
                final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120192);
                BRg bRgA00 = BOI.A00(bRgA03, c1dm, bo4A01);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new G0U() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda16
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return AgentBrowserLiveViewerKt.BrowserViewerPlaceholder$lambda$0$0(strA01, (InterfaceC0857A6e) obj);
                        }
                    };
                    bfm.Ai0(objAaT);
                }
                bRgA03 = AnonymousClass001.A0Y(bRgA00, objAaT, false);
            } else {
                i3 = 0;
                bfm.AgE(-416801282);
            }
            AnonymousClass001.A1D(bfm);
            C3Ue.A04(bRgA03, bfm, i3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda17
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2 = z;
                    BRg bRg3 = bRg2;
                    int i5 = i;
                    AgentBrowserLiveViewerKt.BrowserViewerPlaceholder(z2, bRg3, (BFM) obj, AnonymousClass011.A00(i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit BrowserViewerPlaceholder$lambda$0$0(String str, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 1);
        AbstractC1564Ale.A04(interfaceC0857A6e);
        AbstractC1564Ale.A08(interfaceC0857A6e, str);
        return Unit.INSTANCE;
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3085Bxl.values().length];
            try {
                AnonymousClass002.A13(EnumC3085Bxl.ON_START, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(EnumC3085Bxl.ON_STOP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: $r8$lambda$RiHBqsOqbY5cNKq6sQYj97-aBt8, reason: not valid java name */
    public static /* synthetic */ C78g m3137$r8$lambda$RiHBqsOqbY5cNKq6sQYj97aBt8(BrowserViewerSession.Host host, C0Yr c0Yr) {
        return new AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$4$0$$inlined$onDispose$1(host);
    }

    public static final void AgentBrowserLiveViewer_0vH8DBg$lambda$11(MutableState<BL4> mutableState, long j) {
        mutableState.Af8(new BL4(j));
    }

    public static final C78g AgentBrowserLiveViewer_0vH8DBg$lambda$13$0(BrowserViewerSession.Host host, boolean z, AgentBrowserSurface agentBrowserSurface, C0Yr c0Yr) {
        if (host.viewOnly != z) {
            agentBrowserSurface.takeoverControls.setPanModeEnabled(!z);
            host.updateViewOnly(z);
        }
        return new C78g() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$13$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final C78g AgentBrowserLiveViewer_0vH8DBg$lambda$14$0(long j, double d, BrowserViewerSession.Host host, C0Yr c0Yr) {
        int iA09;
        int i = (int) (j >> 32);
        if (i > 0 && (iA09 = AnonymousClass002.A09(j)) > 0 && Math.abs(d) <= Double.MAX_VALUE && d > 0.0d) {
            double d2 = i;
            double dMax = Math.max(1.0d, 500.0d / d2);
            host.updateViewer(new BrowserViewerPreference(Ab3.A00(d2 * dMax), Ab3.A00(iA09 * dMax), d * dMax));
        }
        return new C78g() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$14$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final C78g AgentBrowserLiveViewer_0vH8DBg$lambda$21$0(boolean z, boolean z2, boolean z3, final AgentBrowserSurface agentBrowserSurface, BrowserViewerSession browserViewerSession, C1BO c1bo, final String str, final C0fG c0fG, C0Yr c0Yr) {
        final AutoCloseable autoCloseableRegisterClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime = (z || !z2 || C1BO.A0F(c1bo) || !z3) ? null : agentBrowserSurface.controller.registerClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgentBrowserLiveViewerKt.AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$0(str, agentBrowserSurface, c0fG);
            }
        }, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgentBrowserLiveViewerKt.AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$1(str, agentBrowserSurface, c0fG);
            }
        }, agentBrowserSurface.takeoverControls.getPendingDeviceClipboardAction(), new AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$9$1$registration$3(browserViewerSession));
        return new C78g() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() throws Exception {
                AutoCloseable autoCloseable = autoCloseableRegisterClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime;
                if (autoCloseable != null) {
                    autoCloseable.close();
                }
            }
        };
    }

    public static final Unit AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$0(String str, AgentBrowserSurface agentBrowserSurface, final C0fG c0fG) {
        logClipboardMenuClick(HatchComponent.COPY_BUTTON, str);
        agentBrowserSurface.takeoverControls.copySelection(new G0U() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda12
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AgentBrowserLiveViewerKt.AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$0$0(c0fG, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$1(String str, AgentBrowserSurface agentBrowserSurface, final C0fG c0fG) {
        logClipboardMenuClick(HatchComponent.PASTE_BUTTON, str);
        agentBrowserSurface.takeoverControls.pasteFromDevice(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgentBrowserLiveViewerKt.AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$1$0(c0fG);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AgentBrowserLiveViewer_0vH8DBg$lambda$22$0(C1Ny c1Ny, AXN axn, int i, MutableState mutableState, BL4 bl4) {
        long j = bl4.A00;
        AgentBrowserLiveViewer_0vH8DBg$lambda$11(mutableState, (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + Math.max(c1Ny.ACy(axn), i)) & 4294967295L));
        return Unit.INSTANCE;
    }

    public static final C78g AgentBrowserLiveViewer_0vH8DBg$lambda$23$0$0(AgentBrowserSurface agentBrowserSurface, boolean z, C0Yr c0Yr) {
        agentBrowserSurface.takeoverControls.setPanModeEnabled(!z);
        return new C78g() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$23$0$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final C78g AgentBrowserLiveViewer_0vH8DBg$lambda$4$0(BrowserViewerSession.Host host, C0Yr c0Yr) {
        return new AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$4$0$$inlined$onDispose$1(host);
    }

    public static final C78g AgentBrowserLiveViewer_0vH8DBg$lambda$5$0(String str, final BrowserViewerSession.Host host, final Object obj, C0Yr c0Yr) {
        final boolean zAreEqual = C7384Etj.areEqual(str, host.taskId);
        return new C78g() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$5$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (zAreEqual) {
                    host.noteOverlayVisibleForMetrics(obj, false);
                }
            }
        };
    }

    public static final void BrowserViewerError(final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(1819134787);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRg2, f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA092 = C3U4.A09(C1b8.A03(bRgA09, auraTheme.getShapes(bfm, 6).card, auraTheme.getColors(bfm, 6).background), f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda14
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        AnonymousClass002.A11((InterfaceC0857A6e) obj);
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRgA092, (G0U) objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(f), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA012, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120193), null, 0L, null, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16318);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201a1), null, null, AuraButtonStyles.INSTANCE.primaryAlt(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, (iA0T << 12) & 57344, 0, 134201325);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda15
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function03 = function0;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    AgentBrowserLiveViewerKt.BrowserViewerError(function03, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final BRg browserErrorImpression(BRg bRg, String str) {
        return HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.CHAT, HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.BROWSER_ERROR_VIEW, null, AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str), null, 0L, 0.0f, null, null, null);
    }

    public static final void logBrowserRetryClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.RETRY_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str), null);
    }

    public static final void logClipboardMenuClick(HatchComponent hatchComponent, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, hatchComponent, null, AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str), null);
    }

    public static /* synthetic */ Unit $r8$lambda$9rFQ3ybUm2QwQ8KCWX5O8PwEjFY(String str, BrowserViewerSession browserViewerSession) {
        logBrowserRetryClick(str);
        browserViewerSession.retry();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$xwCpssYANj8gw7AW9rg2TUWHFKk(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final long AgentBrowserLiveViewer_0vH8DBg$lambda$10(MutableState<BL4> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final Unit AgentBrowserLiveViewer_0vH8DBg$lambda$2(AgentBrowserSurface agentBrowserSurface, BrowserViewerSession browserViewerSession, String str, Object obj, boolean z, boolean z2, float f, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m3142AgentBrowserLiveViewer0vH8DBg(agentBrowserSurface, browserViewerSession, str, obj, z, z2, f, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final String AgentBrowserLiveViewer_0vH8DBg$lambda$21$0$1$0(C0fG c0fG) {
        ApQ apQALZ = c0fG.ALZ();
        if (apQALZ != null) {
            return apQALZ.A00;
        }
        return null;
    }

    public static final Unit AgentBrowserLiveViewer_0vH8DBg$lambda$23$2$0(String str, BrowserViewerSession browserViewerSession) {
        logBrowserRetryClick(str);
        browserViewerSession.retry();
        return Unit.INSTANCE;
    }

    public static final Unit AgentBrowserLiveViewer_0vH8DBg$lambda$24(AgentBrowserSurface agentBrowserSurface, BrowserViewerSession browserViewerSession, String str, Object obj, boolean z, boolean z2, float f, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m3142AgentBrowserLiveViewer0vH8DBg(agentBrowserSurface, browserViewerSession, str, obj, z, z2, f, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final C78g AgentBrowserLiveViewer_0vH8DBg$lambda$6$0(C1HY c1hy, final BrowserViewerSession browserViewerSession, C0Yr c0Yr) {
        final F2N lifecycle = c1hy.getLifecycle();
        final Dg3 dg3 = new Dg3() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$$ExternalSyntheticLambda13
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy2, EnumC3085Bxl enumC3085Bxl) {
                AgentBrowserLiveViewerKt.AgentBrowserLiveViewer_0vH8DBg$lambda$6$0$0(browserViewerSession, c1hy2, enumC3085Bxl);
            }
        };
        lifecycle.A04(dg3);
        if (((C5303Dfm) lifecycle).A01.A00(EnumC10573Huf.A06)) {
            browserViewerSession.noteApplicationForeground(true);
        }
        return new C78g() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$6$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                lifecycle.A05(dg3);
            }
        };
    }

    public static final Unit BrowserViewerError$lambda$0$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit BrowserViewerError$lambda$2(Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        BrowserViewerError(function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit BrowserViewerPlaceholder$lambda$1(boolean z, BRg bRg, int i, int i2, BFM bfm, int i3) {
        BrowserViewerPlaceholder(z, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x02b2  */
    /* renamed from: AgentBrowserLiveViewer-0vH8DBg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3142AgentBrowserLiveViewer0vH8DBg(final com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface r45, final com.facebook.aura.vmbrowser.runtime.BrowserViewerSession r46, final java.lang.String r47, final java.lang.Object r48, final boolean r49, final boolean r50, final float r51, X.BRg r52, X.BFM r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt.m3142AgentBrowserLiveViewer0vH8DBg(com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface, com.facebook.aura.vmbrowser.runtime.BrowserViewerSession, java.lang.String, java.lang.Object, boolean, boolean, float, X.BRg, X.BFM, int, int):void");
    }
}
