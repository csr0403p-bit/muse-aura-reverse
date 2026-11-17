package com.facebook.aura.vmbrowser;

import X.AIC;
import X.AXK;
import X.AbstractC1564Ale;
import X.AbstractC1671Anw;
import X.AbstractC1712Aov;
import X.AbstractC1874Aso;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AuJ;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BQG;
import X.BRg;
import X.C0920AHw;
import X.C0Hi;
import X.C0fG;
import X.C10384HaO;
import X.C10G;
import X.C11S;
import X.C1518AkS;
import X.C1805ArO;
import X.C1BO;
import X.C1C3;
import X.C1HY;
import X.C2AA;
import X.C2Um;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C9xg;
import X.G0U;
import X.G0V;
import X.InterfaceC0857A6e;
import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.browsertask.view.AgentComputerScreenScope;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserRemoteKey;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class BrowserTakeoverBottomBarKt {
    public static final float BAR_BUTTON_SIZE = 48.0f;
    public static final String KEYBOARD_SENTINEL = "\u200b";

    public static final Unit BarIcon$lambda$2$0(Boolean bool, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 1);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        if (bool != null) {
            AbstractC1564Ale.A0E(interfaceC0857A6e, bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit BrowserKeyboardCapture$lambda$5$0(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        C0920AHw<Unit> c0920AHw = AbstractC1671Anw.A0H;
        Unit unit = Unit.INSTANCE;
        interfaceC0857A6e.Aca(c0920AHw, unit);
        return unit;
    }

    public static final Unit BrowserKeyboardCapture$lambda$6$0(MutableState mutableState, C2Um c2Um) {
        C7384Etj.A0Y(c2Um, 1);
        MutableState.A09(c2Um.AOS(), mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit BrowserKeyboardCapture$lambda$8$0(boolean z, AgentBrowserTakeoverControls agentBrowserTakeoverControls, MutableState mutableState, C1805ArO c1805ArO) {
        C7384Etj.A0Y(c1805ArO, 3);
        if (z) {
            C1805ArO c1805ArO2 = (C1805ArO) mutableState.getValue();
            mutableState.Af8(withKeyboardSentinel(c1805ArO));
            forwardKeyboardValueChange(c1805ArO2, c1805ArO, agentBrowserTakeoverControls);
        }
        return Unit.INSTANCE;
    }

    public static final Unit BrowserTakeoverBottomBar$lambda$5$0$1$0$0(C0fG c0fG, String str) {
        C7384Etj.A0Y(str, 1);
        c0fG.Aey(AnonymousClass005.A0X(str));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BarIcon(final int r34, final int r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, X.BRg r37, java.lang.String r38, int r39, java.lang.Boolean r40, boolean r41, X.BFM r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt.BarIcon(int, int, kotlin.jvm.functions.Function0, X.BRg, java.lang.String, int, java.lang.Boolean, boolean, X.BFM, int, int):void");
    }

    public static final void BrowserKeyboardCapture(final AgentBrowserTakeoverControls agentBrowserTakeoverControls, final boolean z, final boolean z2, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2045028518);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentBrowserTakeoverControls, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C1518AkS();
                bfm.Ai0(objAaT);
            }
            C1518AkS c1518AkS = (C1518AkS) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, sentinelTextFieldValue());
            }
            final MutableState mutableState = (MutableState) objAaT2;
            final MutableState mutableState2 = (MutableState) AnonymousClass005.A0g(bfm, bfm.AaT(), obj, false);
            int i4 = iA05 & 14;
            int i5 = iA05 << 6;
            int i6 = i5 & 7168;
            BrowserKeyboardFocusEffect(agentBrowserTakeoverControls, c1518AkS, mutableState2, z, z2, bfm, AnonymousClass001.A0B(i5, i4 | 432 | i6));
            C1805ArO c1805ArO = (C1805ArO) mutableState.getValue();
            AuJ auJ = new AuJ(false, 0, 0, -1);
            BRg bRgA00 = C11S.A00(C10G.A07(bRg2, 1.0f), 0.0f);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new G0U() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$$ExternalSyntheticLambda4
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return BrowserTakeoverBottomBarKt.BrowserKeyboardCapture$lambda$5$0((InterfaceC0857A6e) obj2);
                    }
                };
                bfm.Ai0(objAaT3);
            }
            BRg bRgA002 = BHJ.A00(AnonymousClass001.A0X(bRgA00, objAaT3), c1518AkS);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new G0U() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$$ExternalSyntheticLambda5
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return BrowserTakeoverBottomBarKt.BrowserKeyboardCapture$lambda$6$0(mutableState2, (C2Um) obj2);
                    }
                };
                bfm.Ai0(objAaT4);
            }
            BRg bRgA003 = C9xg.A00(bRgA002, (G0U) objAaT4);
            int i7 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i7, 32) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentBrowserTakeoverControls)));
            Object objAaT5 = bfm.AaT();
            if (zA1Q || objAaT5 == obj) {
                objAaT5 = new G0U<C2AA, Boolean>() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardCapture$3$1
                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m3134invokeZmokQxo(KeyEvent keyEvent) {
                        AgentBrowserTakeoverControls agentBrowserTakeoverControls2;
                        AgentBrowserRemoteKey agentBrowserRemoteKey;
                        C7384Etj.A0Y(keyEvent, 0);
                        boolean z3 = false;
                        if (!z || AbstractC1712Aov.A00(keyEvent) != 2) {
                            return false;
                        }
                        long keyCode = keyEvent.getKeyCode() << 32;
                        if (keyCode == C10384HaO.A0F) {
                            agentBrowserTakeoverControls2 = agentBrowserTakeoverControls;
                            agentBrowserRemoteKey = AgentBrowserRemoteKey.ENTER;
                        } else {
                            if (keyCode == C10384HaO.A04) {
                                agentBrowserTakeoverControls.sendSpecialKey(AgentBrowserRemoteKey.BACKSPACE);
                                mutableState.Af8(BrowserTakeoverBottomBarKt.sentinelTextFieldValue());
                                z3 = true;
                                return Boolean.valueOf(z3);
                            }
                            if (keyCode != C10384HaO.A0c) {
                                if (keyCode == C10384HaO.A0G) {
                                    agentBrowserTakeoverControls2 = agentBrowserTakeoverControls;
                                    agentBrowserRemoteKey = AgentBrowserRemoteKey.ESCAPE;
                                }
                                return Boolean.valueOf(z3);
                            }
                            agentBrowserTakeoverControls2 = agentBrowserTakeoverControls;
                            agentBrowserRemoteKey = AgentBrowserRemoteKey.TAB;
                        }
                        agentBrowserTakeoverControls2.sendSpecialKey(agentBrowserRemoteKey);
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }

                    @Override // X.G0U
                    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
                        return m3134invokeZmokQxo(c2aa.A00);
                    }
                };
                bfm.Ai0(objAaT5);
            }
            BRg bRgThen = bRgA003.then(new AXK(null, (G0U) objAaT5));
            boolean zA1Q2 = AnonymousClass002.A1Q(i7, 32) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentBrowserTakeoverControls)));
            Object objAaT6 = bfm.AaT();
            if (zA1Q2 || objAaT6 == obj) {
                objAaT6 = new G0U() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$$ExternalSyntheticLambda6
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return BrowserTakeoverBottomBarKt.BrowserKeyboardCapture$lambda$8$0(z, agentBrowserTakeoverControls, mutableState, (C1805ArO) obj2);
                    }
                };
                bfm.Ai0(objAaT6);
            }
            AbstractC1874Aso.A02(null, null, auJ, bfm, bRgThen, null, null, c1805ArO, null, (G0U) objAaT6, null, null, 0, 0, i6, 0, 65456, z, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$$ExternalSyntheticLambda7
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    AgentBrowserTakeoverControls agentBrowserTakeoverControls2 = agentBrowserTakeoverControls;
                    boolean z3 = z;
                    boolean z4 = z2;
                    BRg bRg4 = bRg3;
                    int i8 = i;
                    BrowserTakeoverBottomBarKt.BrowserKeyboardCapture(agentBrowserTakeoverControls2, z3, z4, bRg4, (BFM) obj2, AnonymousClass011.A02(obj3, i8), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BrowserTakeoverBottomBar(final com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls r46, final com.facebook.aura.browsertask.view.AgentComputerScreenScope r47, final boolean r48, X.BRg r49, boolean r50, X.BFM r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt.BrowserTakeoverBottomBar(com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls, com.facebook.aura.browsertask.view.AgentComputerScreenScope, boolean, X.BRg, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C78g BrowserTakeoverBottomBar$lambda$4$0(final com.facebook.aura.browsertask.view.AgentComputerScreenScope r3, final com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls r4, boolean r5, X.C0Yr r6) {
        /*
            java.lang.String r2 = r3.taskId
            if (r2 == 0) goto L11
            if (r5 == 0) goto Ld
            boolean r1 = r4.isDeviceClipboardEnabled()
            r0 = 1
            if (r1 != 0) goto Le
        Ld:
            r0 = 0
        Le:
            r4.setDeviceClipboardControlsExposed(r2, r3, r0)
        L11:
            com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$lambda$4$0$$inlined$onDispose$1 r0 = new com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$lambda$4$0$$inlined$onDispose$1
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt.BrowserTakeoverBottomBar$lambda$4$0(com.facebook.aura.browsertask.view.AgentComputerScreenScope, com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls, boolean, X.0Yr):X.78g");
    }

    public static final Unit BrowserTakeoverBottomBar$lambda$5$0$1$0(AgentComputerScreenScope agentComputerScreenScope, AgentBrowserTakeoverControls agentBrowserTakeoverControls, final C0fG c0fG) {
        logBarClick(HatchComponent.COPY_BUTTON, agentComputerScreenScope.taskId);
        agentBrowserTakeoverControls.copySelection(new G0U() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return BrowserTakeoverBottomBarKt.BrowserTakeoverBottomBar$lambda$5$0$1$0$0(c0fG, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit BrowserTakeoverBottomBar$lambda$5$0$2$0(AgentComputerScreenScope agentComputerScreenScope, AgentBrowserTakeoverControls agentBrowserTakeoverControls, final C0fG c0fG) {
        logBarClick(HatchComponent.PASTE_BUTTON, agentComputerScreenScope.taskId);
        agentBrowserTakeoverControls.pasteFromDevice(new Function0() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrowserTakeoverBottomBarKt.BrowserTakeoverBottomBar$lambda$5$0$2$0$0(c0fG);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void forwardKeyboardValueChange(C1805ArO c1805ArO, C1805ArO c1805ArO2, AgentBrowserTakeoverControls agentBrowserTakeoverControls) {
        String str = c1805ArO2.A01.A00;
        if (str.length() == 0 && KEYBOARD_SENTINEL.equals(c1805ArO.A01.A00)) {
            agentBrowserTakeoverControls.sendSpecialKey(AgentBrowserRemoteKey.BACKSPACE);
            return;
        }
        String strA0K = C7BY.A0K(KEYBOARD_SENTINEL, c1805ArO.A01.A00);
        String strA0K2 = C7BY.A0K(KEYBOARD_SENTINEL, str);
        if (C7384Etj.areEqual(strA0K, strA0K2)) {
            return;
        }
        int length = C7BY.A0I(strA0K, strA0K2).length();
        int length2 = strA0K.length() - length;
        for (int i = 0; i < length2; i++) {
            agentBrowserTakeoverControls.sendSpecialKey(AgentBrowserRemoteKey.BACKSPACE);
        }
        agentBrowserTakeoverControls.sendTextInput(BQG.A16(strA0K2, length));
    }

    public static final void logBarClick(HatchComponent hatchComponent, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, hatchComponent, null, str != null ? AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str) : null, null);
    }

    public static final void logPanModeToggle(boolean z, String str) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.PAN_MODE_TOGGLE, null, str != null ? AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str) : null);
    }

    public static final C1805ArO sentinelTextFieldValue() {
        return new C1805ArO(KEYBOARD_SENTINEL, 1 | (1 << 32));
    }

    public static final C1805ArO withKeyboardSentinel(C1805ArO c1805ArO) {
        return c1805ArO.A01.A00.length() == 0 ? sentinelTextFieldValue() : c1805ArO;
    }

    public static /* synthetic */ Unit $r8$lambda$8x43ORlfEid3fR4r4c4SPyoH6ZU(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit BarIcon$lambda$3(int i, int i2, Function0 function0, BRg bRg, String str, int i3, Boolean bool, boolean z, int i4, int i5, BFM bfm, int i6) {
        BarIcon(i, i2, function0, bRg, str, i3, bool, z, bfm, AnonymousClass011.A00(i4), i5);
        return Unit.INSTANCE;
    }

    public static final Unit BrowserKeyboardCapture$lambda$9(AgentBrowserTakeoverControls agentBrowserTakeoverControls, boolean z, boolean z2, BRg bRg, int i, int i2, BFM bfm, int i3) {
        BrowserKeyboardCapture(agentBrowserTakeoverControls, z, z2, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final void BrowserKeyboardFocusEffect(final AgentBrowserTakeoverControls agentBrowserTakeoverControls, final C1518AkS c1518AkS, final C1BO<Boolean> c1bo, final boolean z, final boolean z2, BFM bfm, final int i) {
        bfm.AgG(206958155);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentBrowserTakeoverControls, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c1518AkS);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1bo);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            C1HY c1hy = (C1HY) bfm.A6v(AIC.A00);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            Object[] objArr = {agentBrowserTakeoverControls, Boolean.valueOf(z), c1hy, auraNavigatorA0b, Boolean.valueOf(z2)};
            boolean zA1V = AnonymousClass002.A1V(bfm, c0Hi, AnonymousClass002.A1W(bfm, c1c3, AnonymousClass004.A1T(bfm, c1hy, auraNavigatorA0b, AnonymousClass002.A1Q(iA05 & 7168, 2048)) | AnonymousClass005.A1L(iA05) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentBrowserTakeoverControls))), AnonymousClass004.A1I(iA05)), (iA05 & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1(z, c1hy, auraNavigatorA0b, z2, agentBrowserTakeoverControls, c1bo, c0Hi, c1c3, c1518AkS, null);
                bfm.Ai0(objAaT);
            }
            C78e.A08(bfm, (G0V) objAaT, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BrowserTakeoverBottomBarKt.BrowserKeyboardFocusEffect(agentBrowserTakeoverControls, c1518AkS, c1bo, z, z2, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit BrowserKeyboardFocusEffect$lambda$1(AgentBrowserTakeoverControls agentBrowserTakeoverControls, C1518AkS c1518AkS, C1BO c1bo, boolean z, boolean z2, int i, BFM bfm, int i2) {
        BrowserKeyboardFocusEffect(agentBrowserTakeoverControls, c1518AkS, c1bo, z, z2, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit BrowserTakeoverBottomBar$lambda$5$0$0$0(AgentComputerScreenScope agentComputerScreenScope, AgentBrowserTakeoverControls agentBrowserTakeoverControls, C1BO c1bo) {
        logPanModeToggle(!C1BO.A0F(c1bo), agentComputerScreenScope.taskId);
        agentBrowserTakeoverControls.setPanModeEnabled(!C1BO.A0F(c1bo));
        return Unit.INSTANCE;
    }

    public static final String BrowserTakeoverBottomBar$lambda$5$0$2$0$0(C0fG c0fG) {
        ApQ apQALZ = c0fG.ALZ();
        if (apQALZ != null) {
            return apQALZ.A00;
        }
        return null;
    }

    public static final Unit BrowserTakeoverBottomBar$lambda$5$0$3$0$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit BrowserTakeoverBottomBar$lambda$6(AgentBrowserTakeoverControls agentBrowserTakeoverControls, AgentComputerScreenScope agentComputerScreenScope, boolean z, BRg bRg, boolean z2, int i, int i2, BFM bfm, int i3) {
        BrowserTakeoverBottomBar(agentBrowserTakeoverControls, agentComputerScreenScope, z, bRg, z2, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
