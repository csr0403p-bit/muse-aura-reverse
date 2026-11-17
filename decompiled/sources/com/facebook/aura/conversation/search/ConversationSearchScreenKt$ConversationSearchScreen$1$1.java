package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.C7BY;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$ConversationSearchScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $initialQuery;
    public final /* synthetic */ HatchSearchViewModel $searchViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$ConversationSearchScreen$1$1(String str, HatchSearchViewModel hatchSearchViewModel) {
        super(1);
        this.$initialQuery = str;
        this.$searchViewModel = hatchSearchViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        String str = this.$initialQuery;
        if (str != null && !C7BY.A0j(str)) {
            this.$searchViewModel.searchMessages(this.$initialQuery);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.search.ConversationSearchScreenKt$ConversationSearchScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
