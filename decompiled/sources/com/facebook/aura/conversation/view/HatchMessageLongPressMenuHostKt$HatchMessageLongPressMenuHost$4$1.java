package com.facebook.aura.conversation.view;

import X.AII;
import X.AIM;
import X.AWx;
import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.BHP;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$4$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ Function0<Unit> $doubleTapHeart;
    public final /* synthetic */ String $moreOptionsLabel;
    public final /* synthetic */ Function0<Unit> $onReply;
    public final /* synthetic */ G0U<AWx, Unit> $openContextMenu;
    public final /* synthetic */ String $reactHeartLabel;
    public final /* synthetic */ String $replyLabel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        Function0<Unit> function0 = this.$onReply;
        Function0<Unit> function02 = this.$doubleTapHeart;
        String str = this.$moreOptionsLabel;
        String str2 = this.$replyLabel;
        String str3 = this.$reactHeartLabel;
        G0U<AWx, Unit> g0u = this.$openContextMenu;
        AII aiiA17 = AIM.A17();
        if (function0 != null) {
            aiiA17.add(new BHP(str2, new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$4$1$1$1$1(function0)));
        }
        if (function02 != null) {
            aiiA17.add(new BHP(str3, new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$4$1$1$2$1(function02)));
        }
        aiiA17.add(new BHP(str, new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$4$1$1$3(g0u)));
        AbstractC1564Ale.A0C(interfaceC0857A6e, AIM.A18(aiiA17));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$4$1(Function0<Unit> function0, Function0<Unit> function02, String str, String str2, String str3, G0U<? super AWx, Unit> g0u) {
        super(1);
        this.$onReply = function0;
        this.$doubleTapHeart = function02;
        this.$moreOptionsLabel = str;
        this.$replyLabel = str2;
        this.$reactHeartLabel = str3;
        this.$openContextMenu = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
