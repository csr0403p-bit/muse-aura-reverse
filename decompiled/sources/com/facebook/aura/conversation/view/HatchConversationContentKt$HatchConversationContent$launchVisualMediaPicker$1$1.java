package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AbstractC8147FWl;
import X.AnonymousClass000;
import X.C3Hc;
import X.C3Hd;
import X.C3I3;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7L3;
import X.C7OU;
import X.G0U;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.pairs.PairsHistoryScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchConversationContentKt$HatchConversationContent$launchVisualMediaPicker$1$1 extends AbstractC7559F3s implements G0U<C3Hd, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $filePickerLauncher;
    public final /* synthetic */ String $filePickerTitle;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $visualMediaPickerLauncher;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C3Hd c3Hd) {
        Intent intentA03;
        String[] strArr;
        String strA00;
        C7384Etj.A0Y(c3Hd, 0);
        Integer numAttachmentPickerLimit = this.$viewModel.attachmentPickerLimit();
        if (numAttachmentPickerLimit != null) {
            C7OU<Intent, ActivityResult> c7ou = this.$visualMediaPickerLauncher;
            Context context = this.$context;
            C7OU<Intent, ActivityResult> c7ou2 = this.$filePickerLauncher;
            String str = this.$filePickerTitle;
            int iIntValue = numAttachmentPickerLimit.intValue();
            int iA00 = C7L3.A00();
            C7L3.A00();
            C7L3.A00();
            try {
                if (iIntValue > 1) {
                    C7384Etj.A0Y(context, 0);
                    if (AbstractC8147FWl.A00()) {
                        intentA03 = C60P.A03("android.provider.action.PICK_IMAGES");
                        intentA03.setType(A00(c3Hd));
                        int iMin = Math.min(iIntValue, iA00);
                        if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                            throw C60O.A0i("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                        }
                        intentA03.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
                        intentA03.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                        intentA03.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
                    } else if (context.getPackageManager().resolveActivity(C60P.A03("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(C60P.A03("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                        if (resolveInfoResolveActivity == null) {
                            throw C3cG.A0Q("Required value was null.");
                        }
                        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                        intentA03 = C60P.A03("androidx.activity.result.contract.action.PICK_IMAGES");
                        intentA03.setClassName(((PackageItemInfo) ((ComponentInfo) activityInfo).applicationInfo).packageName, ((PackageItemInfo) activityInfo).name);
                        intentA03.setType(A00(c3Hd));
                        int iMin2 = Math.min(iIntValue, iA00);
                        if (iMin2 <= 1) {
                            throw C60O.A0i("Max items must be greater than 1");
                        }
                        intentA03.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
                        intentA03.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                        intentA03.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
                    } else {
                        intentA03 = C60P.A03(AnonymousClass000.A00(3));
                        intentA03.setType(A00(c3Hd));
                        intentA03.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        if (intentA03.getType() == null) {
                            intentA03.setType("*/*");
                            strArr = new String[]{PairsHistoryScreenKt.IMAGE_MIME_TYPE, PairsHistoryScreenKt.VIDEO_MIME_TYPE};
                            strA00 = AnonymousClass000.A00(5);
                            intentA03.putExtra(strA00, strArr);
                        }
                    }
                } else {
                    C7384Etj.A0Y(context, 0);
                    if (AbstractC8147FWl.A00()) {
                        intentA03 = C60P.A03("android.provider.action.PICK_IMAGES");
                        intentA03.setType(A00(c3Hd));
                        intentA03.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    } else if (context.getPackageManager().resolveActivity(C60P.A03("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                        ResolveInfo resolveInfoResolveActivity2 = context.getPackageManager().resolveActivity(C60P.A03("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                        if (resolveInfoResolveActivity2 == null) {
                            throw C3cG.A0Q("Required value was null.");
                        }
                        ActivityInfo activityInfo2 = resolveInfoResolveActivity2.activityInfo;
                        intentA03 = C60P.A03("androidx.activity.result.contract.action.PICK_IMAGES");
                        intentA03.setClassName(((PackageItemInfo) ((ComponentInfo) activityInfo2).applicationInfo).packageName, ((PackageItemInfo) activityInfo2).name);
                        intentA03.setType(A00(c3Hd));
                        intentA03.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    } else {
                        intentA03 = C60P.A03(AnonymousClass000.A00(3));
                        intentA03.setType(A00(c3Hd));
                        if (intentA03.getType() == null) {
                            intentA03.setType("*/*");
                            strArr = new String[]{PairsHistoryScreenKt.IMAGE_MIME_TYPE, PairsHistoryScreenKt.VIDEO_MIME_TYPE};
                            strA00 = AnonymousClass000.A00(5);
                            intentA03.putExtra(strA00, strArr);
                        }
                    }
                }
                c7ou.A01(null, intentA03);
            } catch (RuntimeException unused) {
                Intent intentA032 = C60P.A03("android.intent.action.GET_CONTENT");
                intentA032.addCategory(AnonymousClass000.A00(4));
                intentA032.setType(c3Hd.equals(C3I3.A00) ? PairsHistoryScreenKt.VIDEO_MIME_TYPE : PairsHistoryScreenKt.IMAGE_MIME_TYPE);
                intentA032.putExtra("android.intent.extra.ALLOW_MULTIPLE", iIntValue > 1);
                Intent intentCreateChooser = Intent.createChooser(intentA032, str);
                C7384Etj.A0U(intentCreateChooser);
                c7ou2.A01(null, intentCreateChooser);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$launchVisualMediaPicker$1$1(HatchConversationViewModel hatchConversationViewModel, C7OU<Intent, ActivityResult> c7ou, Context context, C7OU<Intent, ActivityResult> c7ou2, String str) {
        super(1);
        this.$viewModel = hatchConversationViewModel;
        this.$visualMediaPickerLauncher = c7ou;
        this.$context = context;
        this.$filePickerLauncher = c7ou2;
        this.$filePickerTitle = str;
    }

    public static final String A00(C3Hd c3Hd) {
        if (c3Hd instanceof C3Hc) {
            return PairsHistoryScreenKt.IMAGE_MIME_TYPE;
        }
        if (c3Hd instanceof C3I3) {
            return PairsHistoryScreenKt.VIDEO_MIME_TYPE;
        }
        throw C3cG.A0q();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C3Hd c3Hd) {
        invoke2(c3Hd);
        return Unit.INSTANCE;
    }
}
