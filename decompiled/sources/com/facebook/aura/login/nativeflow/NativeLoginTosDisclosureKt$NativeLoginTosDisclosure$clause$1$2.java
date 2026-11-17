package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.login.nativeflow.HatchTosGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$clause$1$2 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnTokenTap$delegate;
    public final /* synthetic */ HatchTosDisclosure $disclosure;
    public final /* synthetic */ MutableState<String> $openSheetToken$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        G0U g0uA0B;
        String str2;
        C7384Etj.A0Y(str, 0);
        HatchTosGroup hatchTosGroup = this.$disclosure.groups.get(str);
        if (hatchTosGroup instanceof HatchTosGroup.Url) {
            C1BO.A0B(this.$currentOnTokenTap$delegate).invoke("url");
            AuraBrowserLauncherKt.openBrowser(((HatchTosGroup.Url) hatchTosGroup).url, this.$context);
            return;
        }
        if (hatchTosGroup instanceof HatchTosGroup.Documents) {
            g0uA0B = C1BO.A0B(this.$currentOnTokenTap$delegate);
            str2 = "documents";
        } else if (!(hatchTosGroup instanceof HatchTosGroup.Prose)) {
            if (hatchTosGroup != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        } else {
            g0uA0B = C1BO.A0B(this.$currentOnTokenTap$delegate);
            str2 = "disclosure";
        }
        g0uA0B.invoke(str2);
        this.$openSheetToken$delegate.Af8(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$clause$1$2(HatchTosDisclosure hatchTosDisclosure, Context context, C1BO<? extends G0U<? super String, Unit>> c1bo, MutableState<String> mutableState) {
        super(1);
        this.$disclosure = hatchTosDisclosure;
        this.$context = context;
        this.$currentOnTokenTap$delegate = c1bo;
        this.$openSheetToken$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
