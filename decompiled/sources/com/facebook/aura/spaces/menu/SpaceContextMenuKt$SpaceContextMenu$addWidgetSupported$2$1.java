package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.widgets.intf.SpaceWidgetPinning;
import com.facebook.aura.widgets.intf.SpaceWidgets;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1", f = "SpaceContextMenu.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<Boolean>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $canAddWidget;
    public final /* synthetic */ Context $context;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1$1", f = "SpaceContextMenu.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SpaceWidgetPinning pinning = SpaceWidgets.INSTANCE.getPinning();
            boolean z = false;
            if (pinning != null && pinning.isSupported(this.$context)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass1(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1(boolean z, Context context, HtJ<? super SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1> htJ) {
        super(2, htJ);
        this.$canAddWidget = z;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1 spaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1 = new SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1(this.$canAddWidget, this.$context, htJ);
        spaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1.L$0 = obj;
        return spaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$canAddWidget) {
                C78T c78tA0y = AnonymousClass001.A0y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, null);
                this.L$0 = null;
                this.L$1 = mutableState;
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, anonymousClass1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            MutableState.A09(z, mutableState);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$1;
        Hwg.A00(obj);
        boolean z = AnonymousClass001.A1X(obj);
        MutableState.A09(z, mutableState);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<Boolean> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((SpaceContextMenuKt$SpaceContextMenu$addWidgetSupported$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
