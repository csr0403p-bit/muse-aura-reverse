package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$2$1$5$1 extends AbstractC7559F3s implements G0U<C1805ArO, Unit> {
    public final /* synthetic */ MutableState<C1805ArO> $fieldValue$delegate;
    public final /* synthetic */ G0U<String, Unit> $onQueryChange;
    public final /* synthetic */ String $query;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1805ArO c1805ArO) {
        C7384Etj.A0Y(c1805ArO, 0);
        MutableState<C1805ArO> mutableState = this.$fieldValue$delegate;
        float f = ConversationSearchScreenKt.SearchFieldCornerRadius;
        mutableState.Af8(c1805ArO);
        String str = c1805ArO.A01.A00;
        if (C7384Etj.areEqual(str, this.$query)) {
            return;
        }
        this.$onQueryChange.invoke(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchScreenKt$SearchTextField$2$1$5$1(String str, G0U<? super String, Unit> g0u, MutableState<C1805ArO> mutableState) {
        super(1);
        this.$query = str;
        this.$onQueryChange = g0u;
        this.$fieldValue$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1805ArO c1805ArO) {
        invoke2(c1805ArO);
        return Unit.INSTANCE;
    }
}
