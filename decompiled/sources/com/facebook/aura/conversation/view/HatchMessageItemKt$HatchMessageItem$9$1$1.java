package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3UX;
import X.C7384Etj;
import X.F60;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchInlineMediaPreComputeKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$9$1$1", f = "HatchMessageItem.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$9$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $inlineMediaViewerKeySuffix$delegate;
    public final /* synthetic */ MutableState<String> $inlineMediaViewerUrl$delegate;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $url;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$9$1$1(HatchMessageUiModel hatchMessageUiModel, AuraNavigator auraNavigator, String str, MutableState<String> mutableState, MutableState<String> mutableState2, HtJ<? super HatchMessageItemKt$HatchMessageItem$9$1$1> htJ) {
        super(2, htJ);
        this.$message = hatchMessageUiModel;
        this.$navigator = auraNavigator;
        this.$url = str;
        this.$inlineMediaViewerKeySuffix$delegate = mutableState;
        this.$inlineMediaViewerUrl$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageItemKt$HatchMessageItem$9$1$1(this.$message, this.$navigator, this.$url, this.$inlineMediaViewerKeySuffix$delegate, this.$inlineMediaViewerUrl$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AHD<ContentItem> ahd = this.$message.inlineMediaItems;
        String str = this.$url;
        Iterator it = ahd.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = ((ContentItem) it.next()).sharedElementKey;
            if (str2 != null) {
                C7384Etj.A0Y(str, 1);
                if (str2.endsWith(str)) {
                    if (i2 >= 0) {
                        MutableState<String> mutableState = this.$inlineMediaViewerKeySuffix$delegate;
                        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                        for (Object obj2 : ahd) {
                            int i3 = i + 1;
                            if (i < 0) {
                                AbstractC0885AGm.A14();
                                throw F60.createAndThrow();
                            }
                            ContentItem contentItemM937copy9ysdgUI$default = (ContentItem) obj2;
                            if (i == i2) {
                                contentItemM937copy9ysdgUI$default = ContentItem.m937copy9ysdgUI$default(contentItemM937copy9ysdgUI$default, null, null, null, null, null, FGI.A0M(contentItemM937copy9ysdgUI$default.sharedElementKey, MutableState.A05(mutableState)), null, null, null, false, null, null, null, null, null, 32735, null);
                            }
                            arrayListA0i.add(contentItemM937copy9ysdgUI$default);
                            i = i3;
                        }
                        ContentViewerDataHolderKt.navigateToContentViewer(this.$navigator, AGI.A07(arrayListA0i), i2, false, false, null, false);
                    }
                }
            }
            i2++;
        }
        AnonymousClass006.A1C(HatchInlineMediaPreComputeKt.buildFallbackImageContentItem(this.$url, this.$message.id), this.$navigator);
        this.$inlineMediaViewerUrl$delegate.Af8(null);
        this.$inlineMediaViewerKeySuffix$delegate.Af8("");
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageItemKt$HatchMessageItem$9$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
