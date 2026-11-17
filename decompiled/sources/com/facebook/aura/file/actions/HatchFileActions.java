package com.facebook.aura.file.actions;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C7mU;
import X.EnumC10460Hji;
import X.HtJ;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.utils.HatchSaveLogOrigin;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchFileActions {
    public static final String GOOGLE_DRIVE_PACKAGE = "com.google.android.apps.docs";
    public static final HatchFileActions INSTANCE = new HatchFileActions();

    public final boolean openExternally(Context context, HatchFileRef.Local local, String str) {
        boolean zA1a = AnonymousClass002.A1a(context, local);
        if (str == null) {
            str = HatchMimeResolver.INSTANCE.mimeForContentUri(context, local.uri);
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(local.uri, str);
        intent.setClipData(ClipData.newUri(context.getContentResolver(), local.getDisplayName(), local.uri));
        intent.addFlags(zA1a ? 1 : 0);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        try {
            C7mU.A00().A03().A05(context, Intent.createChooser(intent, null));
            return zA1a;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final Intent buildSendIntent(Context context, Uri uri, String str) {
        String strMimeForContentUri = HatchMimeResolver.INSTANCE.mimeForContentUri(context, uri);
        if ("application/octet-stream".equals(strMimeForContentUri) || strMimeForContentUri == null) {
            strMimeForContentUri = "*/*";
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(strMimeForContentUri);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setClipData(ClipData.newUri(context.getContentResolver(), str, uri));
        intent.addFlags(1);
        return intent;
    }

    public static /* synthetic */ Object download$default(HatchFileActions hatchFileActions, Context context, HatchFileRef hatchFileRef, AbstractC3358CGz abstractC3358CGz, boolean z, HatchSaveLogOrigin hatchSaveLogOrigin, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            hatchSaveLogOrigin = null;
        }
        return hatchFileActions.download(context, hatchFileRef, abstractC3358CGz, z, hatchSaveLogOrigin, htJ);
    }

    public static /* synthetic */ void shareLocal$default(HatchFileActions hatchFileActions, Context context, HatchFileRef.Local local, CharSequence charSequence, int i, Object obj) {
        if ((i & 4) != 0) {
            charSequence = null;
        }
        hatchFileActions.shareLocal(context, local, charSequence);
    }

    public final Object copyToClipboard(Context context, HatchFileRef hatchFileRef, AbstractC3358CGz abstractC3358CGz, Function0<Boolean> function0, HtJ<? super Unit> htJ) {
        Object objCopyLocalUriToClipboard;
        if (hatchFileRef instanceof HatchFileRef.Workspace) {
            HatchFileRef.Workspace workspace = (HatchFileRef.Workspace) hatchFileRef;
            objCopyLocalUriToClipboard = HatchFileUIUtils.INSTANCE.copyFileToClipboard(context, workspace.relativePath, workspace.getDisplayName(), abstractC3358CGz, function0, htJ);
        } else {
            if (!(hatchFileRef instanceof HatchFileRef.Local)) {
                throw new NoWhenBranchMatchedException();
            }
            HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
            HatchFileRef.Local local = (HatchFileRef.Local) hatchFileRef;
            String string = local.uri.toString();
            C7384Etj.A0U(string);
            objCopyLocalUriToClipboard = hatchFileUIUtils.copyLocalUriToClipboard(context, string, local.getDisplayName(), function0, htJ);
        }
        return objCopyLocalUriToClipboard != EnumC10460Hji.A02 ? Unit.INSTANCE : objCopyLocalUriToClipboard;
    }

    public final Object download(Context context, HatchFileRef hatchFileRef, AbstractC3358CGz abstractC3358CGz, boolean z, HatchSaveLogOrigin hatchSaveLogOrigin, HtJ<? super Unit> htJ) {
        String string;
        if (hatchFileRef instanceof HatchFileRef.Workspace) {
            string = ((HatchFileRef.Workspace) hatchFileRef).relativePath;
        } else {
            if (!(hatchFileRef instanceof HatchFileRef.Local)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((HatchFileRef.Local) hatchFileRef).uri.toString();
            C7384Etj.A0U(string);
        }
        Object objDownloadFileWithToast = HatchFileUIUtils.INSTANCE.downloadFileWithToast(context, string, hatchFileRef.getDisplayName(), abstractC3358CGz, z, hatchSaveLogOrigin, htJ);
        return objDownloadFileWithToast != EnumC10460Hji.A02 ? Unit.INSTANCE : objDownloadFileWithToast;
    }

    public final Object saveToGoogleDrive(Context context, HatchFileRef hatchFileRef, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        if (hatchFileRef instanceof HatchFileRef.Workspace) {
            HatchFileRef.Workspace workspace = (HatchFileRef.Workspace) hatchFileRef;
            Object objSaveToGoogleDrive = HatchFileUIUtils.INSTANCE.saveToGoogleDrive(context, workspace.relativePath, workspace.getDisplayName(), abstractC3358CGz, htJ);
            if (objSaveToGoogleDrive == EnumC10460Hji.A02) {
                return objSaveToGoogleDrive;
            }
        } else {
            if (!(hatchFileRef instanceof HatchFileRef.Local)) {
                throw new NoWhenBranchMatchedException();
            }
            HatchFileRef.Local local = (HatchFileRef.Local) hatchFileRef;
            Intent intentBuildSendIntent = buildSendIntent(context, local.uri, local.getDisplayName());
            intentBuildSendIntent.setPackage(GOOGLE_DRIVE_PACKAGE);
            if (intentBuildSendIntent.resolveActivity(context.getPackageManager()) != null) {
                C7mU.A00().A02().A05(context, intentBuildSendIntent);
            } else {
                Intent intent = new Intent(intentBuildSendIntent);
                intent.setPackage(null);
                C7mU.A00().A03().A05(context, Intent.createChooser(intent, null));
            }
        }
        return Unit.INSTANCE;
    }

    public final Object share(Context context, HatchFileRef hatchFileRef, AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        if (hatchFileRef instanceof HatchFileRef.Workspace) {
            HatchFileRef.Workspace workspace = (HatchFileRef.Workspace) hatchFileRef;
            Object objShareFileWithChooser = HatchFileUIUtils.INSTANCE.shareFileWithChooser(context, workspace.relativePath, workspace.getDisplayName(), abstractC3358CGz, htJ);
            if (objShareFileWithChooser == EnumC10460Hji.A02) {
                return objShareFileWithChooser;
            }
        } else {
            if (!(hatchFileRef instanceof HatchFileRef.Local)) {
                throw new NoWhenBranchMatchedException();
            }
            shareLocal(context, (HatchFileRef.Local) hatchFileRef, null);
        }
        return Unit.INSTANCE;
    }

    public final void shareLocal(Context context, HatchFileRef.Local local, CharSequence charSequence) {
        AnonymousClass003.A0u(context, local);
        C7mU.A00().A03().A05(context, Intent.createChooser(buildSendIntent(context, local.uri, local.getDisplayName()), charSequence));
    }
}
