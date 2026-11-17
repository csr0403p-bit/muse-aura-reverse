package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1160Acs;
import X.C16C;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationAudioPlaybackKt$rememberConversationAudioPlayback$isAudioSourceVisible$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ String $audioSourceMessageId;
    public final /* synthetic */ Function0<List<HatchConversationListItem>> $items;
    public final /* synthetic */ LazyListState $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationAudioPlaybackKt$rememberConversationAudioPlayback$isAudioSourceVisible$1$1(String str, LazyListState lazyListState, Function0<? extends List<? extends HatchConversationListItem>> function0) {
        super(0);
        this.$audioSourceMessageId = str;
        this.$listState = lazyListState;
        this.$items = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        String str = this.$audioSourceMessageId;
        boolean z = false;
        if (str != null) {
            List listA0j = AnonymousClass003.A0j(this.$listState);
            Function0<List<HatchConversationListItem>> function0 = this.$items;
            if (!(listA0j instanceof Collection) || !listA0j.isEmpty()) {
                Iterator it = listA0j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object objA0A = AbstractC0878AGe.A0A(((C1160Acs) ((C16C) it.next())).A07, function0.invoke());
                    String str2 = null;
                    if ((objA0A instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) objA0A) != null && (hatchMessageUiModel = message.message) != null) {
                        str2 = hatchMessageUiModel.id;
                    }
                    if (str.equals(str2)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
