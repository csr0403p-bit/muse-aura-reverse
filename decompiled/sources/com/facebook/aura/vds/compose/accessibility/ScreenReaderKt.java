package com.facebook.aura.vds.compose.accessibility;

import X.AKO;
import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BBI;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ScreenReaderKt {

    /* renamed from: com.facebook.aura.vds.compose.accessibility.ScreenReaderKt$addServicesStateChangeListener$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AccessibilityManager.AccessibilityServicesStateChangeListener $listener;
        public final /* synthetic */ AccessibilityManager $this_addServicesStateChangeListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AccessibilityManager accessibilityManager, AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener) {
            super(0);
            this.$this_addServicesStateChangeListener = accessibilityManager;
            this.$listener = accessibilityServicesStateChangeListener;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_addServicesStateChangeListener.removeAccessibilityServicesStateChangeListener(this.$listener);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static final Function0<Unit> addServicesStateChangeListener(AccessibilityManager accessibilityManager, final Function0<Unit> function0) {
        AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener = new AccessibilityManager.AccessibilityServicesStateChangeListener() { // from class: com.facebook.aura.vds.compose.accessibility.ScreenReaderKt$addServicesStateChangeListener$listener$1
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
            public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager2) {
                function0.invoke();
            }
        };
        accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityServicesStateChangeListener);
        return new AnonymousClass1(accessibilityManager, accessibilityServicesStateChangeListener);
    }

    public static final boolean hasEnabledService(AccessibilityManager accessibilityManager) {
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            C7384Etj.A0U(enabledAccessibilityServiceList);
            if (!enabledAccessibilityServiceList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean rememberIsAccessibilityServiceEnabled(BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        boolean zA65 = bfm.A65(contextA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            Object systemService = contextA00.getSystemService("accessibility");
            objAaT = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            bfm.Ai0(objAaT);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objAaT;
        boolean zA652 = bfm.A65(accessibilityManager);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = AbstractC1798ArH.A05(bbi, hasEnabledService(accessibilityManager));
        }
        MutableState mutableState = (MutableState) objAaT2;
        boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, accessibilityManager);
        Object objAaT3 = bfm.AaT();
        if (zA1J || objAaT3 == C78N.A00) {
            objAaT3 = new ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1(accessibilityManager, mutableState);
            BBI.A0O(bbi, objAaT3);
        }
        AnonymousClass001.A17(bfm, objAaT3, accessibilityManager);
        return MutableState.A0A(mutableState);
    }

    public static final boolean rememberIsScreenReaderEnabled(BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        boolean zA65 = bfm.A65(contextA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            Object systemService = contextA00.getSystemService("accessibility");
            objAaT = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            bfm.Ai0(objAaT);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objAaT;
        boolean zA652 = bfm.A65(accessibilityManager);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            boolean z = true;
            if (!Boolean.getBoolean("is_accessibility_enabled") && (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled())) {
                z = false;
            }
            objAaT2 = AbstractC1798ArH.A05(bbi, z);
        }
        MutableState mutableState = (MutableState) objAaT2;
        boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, accessibilityManager);
        Object objAaT3 = bfm.AaT();
        if (zA1J || objAaT3 == C78N.A00) {
            objAaT3 = new ScreenReaderKt$rememberIsScreenReaderEnabled$1$1(accessibilityManager, mutableState);
            BBI.A0O(bbi, objAaT3);
        }
        AnonymousClass001.A17(bfm, objAaT3, accessibilityManager);
        return MutableState.A0A(mutableState);
    }
}
