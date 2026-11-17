package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchInlineFileChipKt$ChipMenuButton$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ String $artifactType;
    public final /* synthetic */ HatchScreen $chipScreen;
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ HatchDocumentChipMenuActions $menuActions;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        HatchInlineFileChipKt.logChipMenuItemClick(this.$chipScreen, auraContextMenuItem.id, this.$artifactType, this.$threadLogMetadata);
        int i = auraContextMenuItem.id;
        if (i == 0) {
            function0 = this.$menuActions.onShare;
        } else if (i == 1) {
            function0 = this.$menuActions.onDownloadAsHtml;
        } else if (i == 2) {
            function0 = this.$menuActions.onSaveToGoogleDrive;
        } else if (i == 3) {
            function0 = this.$menuActions.onDownloadAsPdf;
        } else if (i != 4) {
            return;
        } else {
            function0 = this.$menuActions.onDownload;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineFileChipKt$ChipMenuButton$1$2$1(HatchScreen hatchScreen, String str, Map<String, String> map, HatchDocumentChipMenuActions hatchDocumentChipMenuActions, MutableState<Boolean> mutableState) {
        super(1);
        this.$chipScreen = hatchScreen;
        this.$artifactType = str;
        this.$threadLogMetadata = map;
        this.$menuActions = hatchDocumentChipMenuActions;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
