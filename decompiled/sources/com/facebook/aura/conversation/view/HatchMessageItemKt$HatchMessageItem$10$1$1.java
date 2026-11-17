package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C7BY;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$10$1$1", f = "HatchMessageItem.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$10$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $inlineFileViewerName$delegate;
    public final /* synthetic */ MutableState<String> $inlineFileViewerUrl$delegate;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $url;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$10$1$1(String str, HatchMessageUiModel hatchMessageUiModel, AuraNavigator auraNavigator, MutableState<String> mutableState, MutableState<String> mutableState2, HtJ<? super HatchMessageItemKt$HatchMessageItem$10$1$1> htJ) {
        super(2, htJ);
        this.$url = str;
        this.$message = hatchMessageUiModel;
        this.$navigator = auraNavigator;
        this.$inlineFileViewerName$delegate = mutableState;
        this.$inlineFileViewerUrl$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageItemKt$HatchMessageItem$10$1$1(this.$url, this.$message, this.$navigator, this.$inlineFileViewerName$delegate, this.$inlineFileViewerUrl$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String strA05 = MutableState.A05(this.$inlineFileViewerName$delegate);
        String str = this.$url;
        if (strA05.length() == 0) {
            strA05 = C7BY.A0V(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str);
        }
        AnonymousClass006.A1C(new ContentItem(strA05, ContentTypeDetector.INSTANCE.fromFileName(strA05), this.$url, null, null, null, this.$message.id, null, null, false, null, null, null, null, null), this.$navigator);
        this.$inlineFileViewerUrl$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageItemKt$HatchMessageItem$10$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
