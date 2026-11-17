package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C7BY;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$11$1$1", f = "HatchMessageItem.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$11$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $inlineSlidesViewerUrl$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $slidePath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$11$1$1(String str, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, MutableState<String> mutableState, HtJ<? super HatchMessageItemKt$HatchMessageItem$11$1$1> htJ) {
        super(2, htJ);
        this.$slidePath = str;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$inlineSlidesViewerUrl$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageItemKt$HatchMessageItem$11$1$1(this.$slidePath, this.$userSession, this.$navigator, this.$inlineSlidesViewerUrl$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String str = this.$slidePath;
        String strA0V = C7BY.A0V(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str);
        ContentType.Slides slides = ContentType.Slides.INSTANCE;
        String str2 = this.$slidePath;
        AnonymousClass006.A1C(new ContentItem(strA0V, slides, str2, WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(str2, this.$userSession), null, null, null, null, null, false, null, null, null, null, null), this.$navigator);
        this.$inlineSlidesViewerUrl$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageItemKt$HatchMessageItem$11$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
