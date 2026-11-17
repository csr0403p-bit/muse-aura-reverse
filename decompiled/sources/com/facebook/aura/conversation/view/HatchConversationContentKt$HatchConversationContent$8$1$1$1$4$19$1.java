package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$19$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        AuraNavigator auraNavigator;
        AHD ahdA0E;
        ContentViewerBottomActions contentViewerBottomActions;
        C7384Etj.A0Y(str, 0);
        int iIndexOf = this.$uiState$delegate.getValue().pendingImageUris.indexOf(str);
        if (iIndexOf >= 0) {
            AHD<String> ahd = this.$uiState$delegate.getValue().pendingImageUris;
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(HatchConversationContentKt.buildLocalImageContentItem(AnonymousClass005.A0j(it)));
            }
            ahdA0E = AGI.A07(arrayListA0i);
            auraNavigator = this.$navigator;
            contentViewerBottomActions = null;
        } else {
            auraNavigator = this.$navigator;
            ahdA0E = AGI.A0E(HatchConversationContentKt.buildLocalFileContentItem(this.$context, str));
            contentViewerBottomActions = null;
            iIndexOf = 0;
        }
        ContentViewerDataHolderKt.navigateToContentViewer(auraNavigator, ahdA0E, iIndexOf, false, false, contentViewerBottomActions, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$19$1(AuraNavigator auraNavigator, Context context, C1BO<HatchConversationUiState> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$context = context;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
