package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.shortcut.HatchShortcutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1", f = "SpaceContextMenu.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<Boolean>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1(Context context, HtJ<? super SpaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1> htJ) {
        super(2, htJ);
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SpaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1 spaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1 = new SpaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1(this.$context, htJ);
        spaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1.L$0 = obj;
        return spaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchShortcutManager hatchShortcutManager = HatchShortcutManager.INSTANCE;
            Context context = this.$context;
            this.L$0 = null;
            this.L$1 = mutableState;
            this.label = 1;
            obj = hatchShortcutManager.isRequestPinShortcutSupported(context, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$1;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<Boolean> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((SpaceContextMenuKt$SpaceContextMenu$addShortcutSupported$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
