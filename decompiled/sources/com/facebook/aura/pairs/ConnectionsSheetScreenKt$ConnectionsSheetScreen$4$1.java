package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C3cG;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.pairs.ConnectionsSheetItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsSheetScreenKt$ConnectionsSheetScreen$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmRemove$delegate;
    public final /* synthetic */ Map<String, String> $connectionType;
    public final /* synthetic */ ConnectionsInfo $info;
    public final /* synthetic */ ConnectionsSheetItem $item;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsSheetScreenKt$ConnectionsSheetScreen$4$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, ConnectionsSheetItem connectionsSheetItem, ConnectionsViewModel connectionsViewModel, ConnectionsInfo connectionsInfo, MutableState<Boolean> mutableState) {
        super(0);
        this.$log = connectionsLogContext;
        this.$connectionType = map;
        this.$item = connectionsSheetItem;
        this.$viewModel = connectionsViewModel;
        this.$info = connectionsInfo;
        this.$confirmRemove$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.DELETE_CONFIRM_BUTTON, HatchSubsurface.CONNECTIONS_DIALOG, this.$connectionType);
        MutableState.A09(false, this.$confirmRemove$delegate);
        ConnectionsSheetItem connectionsSheetItem = this.$item;
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Person) {
            this.$viewModel.remove(((ConnectionsSheetItem.Person) connectionsSheetItem).person.contact, this.$info);
        } else {
            if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Group)) {
                throw C3cG.A0q();
            }
            this.$viewModel.removeGroup(((ConnectionsSheetItem.Group) connectionsSheetItem).group);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
