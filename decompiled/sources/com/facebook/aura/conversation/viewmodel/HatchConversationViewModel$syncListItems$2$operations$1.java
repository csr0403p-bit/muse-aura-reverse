package com.facebook.aura.conversation.viewmodel;

import X.A3Y;
import X.A3Z;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BQG;
import X.C3UX;
import X.C7354EnR;
import X.C7384Etj;
import X.CFK;
import X.F60;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.status.repo.AgentActivityInfo;
import com.facebook.aura.utils.RecordedListOperation;
import com.facebook.aura.utils.SnapshotStateListUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$2$operations$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$syncListItems$2$operations$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AHD<? extends RecordedListOperation<HatchConversationListItem>>>, Object> {
    public final /* synthetic */ AgentActivityInfo $agentActivity;
    public final /* synthetic */ HatchConversationState $convState;
    public final /* synthetic */ boolean $isAwaitingApproval;
    public int label;
    public final /* synthetic */ HatchConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationViewModel$syncListItems$2$operations$1(HatchConversationViewModel hatchConversationViewModel, HatchConversationState hatchConversationState, AgentActivityInfo agentActivityInfo, boolean z, HtJ<? super HatchConversationViewModel$syncListItems$2$operations$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConversationViewModel;
        this.$convState = hatchConversationState;
        this.$agentActivity = agentActivityInfo;
        this.$isAwaitingApproval = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationViewModel$syncListItems$2$operations$1(this.this$0, this.$convState, this.$agentActivity, this.$isAwaitingApproval, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super AHD<? extends RecordedListOperation<HatchConversationListItem>>> htJ) {
        return invoke2(c3ux, (HtJ<? super AHD<RecordedListOperation<HatchConversationListItem>>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objPrevious;
        HatchConversationListItem hatchConversationListItemPrevious;
        String strA17;
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        String str;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        SnapshotStateList<HatchConversationListItem> snapshotStateList = this.this$0._listItems;
        int i = 0;
        if ((snapshotStateList instanceof Collection) && snapshotStateList.isEmpty()) {
            z = false;
        } else {
            Iterator it = snapshotStateList.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof HatchConversationListItem.TypingCursor) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        SnapshotStateList<HatchConversationListItem> snapshotStateList2 = this.this$0._listItems;
        ListIterator listIterator = snapshotStateList2.listIterator(snapshotStateList2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (objPrevious instanceof HatchConversationListItem.Message) {
                break;
            }
        }
        HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) objPrevious;
        String key = hatchConversationListItem != null ? hatchConversationListItem.getKey() : null;
        HatchConversationViewModel hatchConversationViewModel = this.this$0;
        List<HatchConversationListItem> listBuildListItems = hatchConversationViewModel.listMapper.buildListItems(this.$convState, this.$agentActivity, this.$isAwaitingApproval, hatchConversationViewModel._listItems);
        ListIterator<HatchConversationListItem> listIterator2 = listBuildListItems.listIterator(listBuildListItems.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                hatchConversationListItemPrevious = null;
                break;
            }
            hatchConversationListItemPrevious = listIterator2.previous();
            if (hatchConversationListItemPrevious instanceof HatchConversationListItem.Message) {
                break;
            }
        }
        HatchConversationListItem.Message message2 = hatchConversationListItemPrevious instanceof HatchConversationListItem.Message ? (HatchConversationListItem.Message) hatchConversationListItemPrevious : null;
        if (z) {
            if (!(listBuildListItems instanceof Collection) || !listBuildListItems.isEmpty()) {
                Iterator<HatchConversationListItem> it2 = listBuildListItems.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof HatchConversationListItem.TypingCursor) {
                        break;
                    }
                }
                if (message2 != null && !C7384Etj.areEqual(message2.key, key)) {
                    this.this$0.cursorHandoffKey = message2.key;
                }
            } else if (message2 != null) {
                this.this$0.cursorHandoffKey = message2.key;
            }
        }
        String str2 = this.this$0.cursorHandoffKey;
        final ArrayList arrayListA0m = AnonymousClass002.A0m(listBuildListItems);
        for (Object objCopy : listBuildListItems) {
            if (objCopy instanceof HatchConversationListItem.Message) {
                HatchConversationListItem.Message message3 = (HatchConversationListItem.Message) objCopy;
                if (C7384Etj.areEqual(message3.key, str2)) {
                    objCopy = message3.copy(message3.message, message3.renderedIdOverride, true);
                }
            }
            arrayListA0m.add(objCopy);
        }
        Map mapA00 = A3Z.A00(new A3Y<HatchConversationListItem, String>() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$2$operations$1$invokeSuspend$$inlined$groupingBy$1
            @Override // X.A3Y
            public String keyOf(HatchConversationListItem hatchConversationListItem2) {
                return hatchConversationListItem2.getKey();
            }

            @Override // X.A3Y
            public Iterator<HatchConversationListItem> sourceIterator() {
                return arrayListA0m.iterator();
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itA0n = AnonymousClass002.A0n(mapA00);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            if (AnonymousClass001.A0F(entry.getValue()) > 1) {
                AnonymousClass006.A1R(linkedHashMap, entry);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            CFK.A04("HatchConversationVM", AnonymousClass007.A0a("syncListItems: DUPLICATE KEYS in newListItems! associateBy will silently drop duplicates: ", linkedHashMap));
            for (Object obj2 : arrayListA0m) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HatchConversationListItem hatchConversationListItem2 = (HatchConversationListItem) obj2;
                if (linkedHashMap.containsKey(hatchConversationListItem2.getKey())) {
                    if (!(hatchConversationListItem2 instanceof HatchConversationListItem.Message) || (message = (HatchConversationListItem.Message) hatchConversationListItem2) == null || (hatchMessageUiModel = message.message) == null || (str = hatchMessageUiModel.content) == null || (strA17 = BQG.A17(str, 50)) == null) {
                        strA17 = "";
                    }
                    String key2 = hatchConversationListItem2.getKey();
                    StringBuilder sb = new StringBuilder("syncListItems: dupKey[");
                    sb.append(i);
                    sb.append("] key=");
                    sb.append(key2);
                    sb.append(" content='");
                    sb.append(strA17);
                    CFK.A04("HatchConversationVM", AnonymousClass001.A0v("'", sb));
                }
                i = i2;
            }
        }
        SnapshotStateList<HatchConversationListItem> snapshotStateList3 = this.this$0._listItems;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AnonymousClass005.A0C(arrayListA0m));
        for (Object obj3 : arrayListA0m) {
            linkedHashMap2.put(((HatchConversationListItem) obj3).getKey(), obj3);
        }
        return SnapshotStateListUtilsKt.calculateDiff(snapshotStateList3, linkedHashMap2, new C7354EnR() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$2$operations$1.4
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public Object get(Object obj4) {
                return ((HatchConversationListItem) obj4).getKey();
            }
        });
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super AHD<RecordedListOperation<HatchConversationListItem>>> htJ) {
        return ((HatchConversationViewModel$syncListItems$2$operations$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
