package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C7BY;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.IdentityScreenKt$IdentityScreen$2$4$1$1", f = "IdentityScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdentityScreenKt$IdentityScreen$2$4$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $filePath;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<String> $openFilePath$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityScreenKt$IdentityScreen$2$4$1$1(String str, AuraNavigator auraNavigator, MutableState<String> mutableState, HtJ<? super IdentityScreenKt$IdentityScreen$2$4$1$1> htJ) {
        super(2, htJ);
        this.$filePath = str;
        this.$navigator = auraNavigator;
        this.$openFilePath$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdentityScreenKt$IdentityScreen$2$4$1$1(this.$filePath, this.$navigator, this.$openFilePath$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String str = this.$filePath;
        AnonymousClass006.A1C(new ContentItem(C7BY.A0R(str, str, '/'), ContentTypeDetector.INSTANCE.fromFileName(this.$filePath), this.$filePath, null, null, null, null, null, null, false, null, null, null, null, null), this.$navigator);
        this.$openFilePath$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((IdentityScreenKt$IdentityScreen$2$4$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
