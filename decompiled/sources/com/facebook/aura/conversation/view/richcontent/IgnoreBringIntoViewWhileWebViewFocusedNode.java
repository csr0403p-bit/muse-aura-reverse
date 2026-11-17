package com.facebook.aura.conversation.view.richcontent;

import X.ARZ;
import X.AaC;
import X.AbstractC1223Af1;
import X.AbstractC1414Aij;
import X.AbstractC1439Aj8;
import X.AbstractC7559F3s;
import X.C1Z2;
import X.EnumC10460Hji;
import X.HtJ;
import X.InterfaceC1224Af2;
import X.InterfaceC1497Ak4;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IgnoreBringIntoViewWhileWebViewFocusedNode extends AbstractC1439Aj8 implements InterfaceC1224Af2, C1Z2 {

    /* renamed from: com.facebook.aura.conversation.view.richcontent.IgnoreBringIntoViewWhileWebViewFocusedNode$bringIntoView$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<AaC> {
        public final /* synthetic */ Function0<AaC> $boundsProvider;
        public final /* synthetic */ long $offset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<AaC> function0, long j) {
            super(0);
            this.$boundsProvider = function0;
            this.$offset = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AaC invoke() {
            AaC aaCInvoke = this.$boundsProvider.invoke();
            if (aaCInvoke != null) {
                return aaCInvoke.A03(this.$offset);
            }
            return null;
        }
    }

    @Override // X.InterfaceC1224Af2
    public Object bringIntoView(InterfaceC1497Ak4 interfaceC1497Ak4, Function0<AaC> function0, HtJ<? super Unit> htJ) {
        Object objA00;
        return ((((View) ARZ.A01(AndroidCompositionLocals_androidKt.A05, this)).findFocus() instanceof WidgetFieldHost) || (objA00 = AbstractC1223Af1.A00(this, htJ, new AnonymousClass2(function0, AbstractC1414Aij.A05(this).APn(interfaceC1497Ak4, 0L, true)))) != EnumC10460Hji.A02) ? Unit.INSTANCE : objA00;
    }
}
