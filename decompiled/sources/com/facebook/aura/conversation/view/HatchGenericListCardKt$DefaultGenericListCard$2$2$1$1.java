package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate;
import com.facebook.aura.model.GenericListRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGenericListCardKt$DefaultGenericListCard$2$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ int $index;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ GenericListRow $row;
    public final /* synthetic */ GenericListSelectionDelegate $selections;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGenericListCardKt$DefaultGenericListCard$2$2$1$1(GenericListRow genericListRow, GenericListSelectionDelegate genericListSelectionDelegate, String str, String str2, int i) {
        super(0);
        this.$row = genericListRow;
        this.$selections = genericListSelectionDelegate;
        this.$hostMessageId = str;
        this.$presentationId = str2;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str = this.$row.messageText;
        if (str != null) {
            GenericListSelectionDelegate genericListSelectionDelegate = this.$selections;
            String str2 = this.$hostMessageId;
            String str3 = this.$presentationId;
            int i = this.$index;
            if (genericListSelectionDelegate != null) {
                genericListSelectionDelegate.select(str2, str3, i, str);
            }
            HatchGenericListCardKt.logRowClick();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
