package com.facebook.aura.vmbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$2$1", f = "BrowserTakeoverBottomBar.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AgentBrowserTakeoverControls $controls;
    public final /* synthetic */ C0dx $haptics;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$2$1(AgentBrowserTakeoverControls agentBrowserTakeoverControls, C0dx c0dx, HtJ<? super BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$2$1> htJ) {
        super(2, htJ);
        this.$controls = agentBrowserTakeoverControls;
        this.$haptics = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$2$1(this.$controls, this.$haptics, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Unit> deviceClipboardActionSucceeded = this.$controls.getDeviceClipboardActionSucceeded();
            final C0dx c0dx = this.$haptics;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$2$1.1
                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    c0dx.AXr(AuraHaptics.CONTEXT_TAP);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    c0dx.AXr(AuraHaptics.CONTEXT_TAP);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (deviceClipboardActionSucceeded.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((BrowserTakeoverBottomBarKt$BrowserTakeoverBottomBar$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
