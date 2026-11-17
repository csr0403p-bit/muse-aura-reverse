package com.facebook.aura.bloks.plugins.core.screenshotandshare;

import X.AnonymousClass007;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.F6D;
import X.FBB;
import X.FGI;
import X.Hj6;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class MWABloksScreenshotAndShareImplementation {
    public static final MWABloksScreenshotAndShareImplementation INSTANCE = new MWABloksScreenshotAndShareImplementation();
    public static final String TAG = "MWAScreenshotAndShare";

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        Context baseContext;
        C7384Etj.A0Y(f6d, 1);
        FBB fbb = f6d.A02;
        final Context context = fbb != null ? fbb.A00 : null;
        if (context == null) {
            CFK.A06(TAG, "Cannot take screenshot: Context not found");
            return null;
        }
        Context context2 = context;
        Context baseContext2 = context;
        boolean z = false;
        while (true) {
            if (!(context2 instanceof Activity)) {
                if ((context2 instanceof ContextWrapper) && context2 != (baseContext = ((ContextWrapper) context2).getBaseContext())) {
                    if (z && (baseContext2 instanceof ContextWrapper)) {
                        baseContext2 = ((ContextWrapper) baseContext2).getBaseContext();
                    }
                    z = !z;
                    if (baseContext == baseContext2) {
                        break;
                    }
                    context2 = baseContext;
                } else {
                    break;
                }
            } else {
                Activity activity = (Activity) context2;
                if (activity != null) {
                    try {
                        Window window = activity.getWindow();
                        if (window == null) {
                            CFK.A06(TAG, "Cannot take screenshot: Window not found");
                            return null;
                        }
                        View rootView = window.getDecorView().getRootView();
                        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                        PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.facebook.aura.bloks.plugins.core.screenshotandshare.MWABloksScreenshotAndShareImplementation.evaluate.1
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i) {
                                if (i == 0) {
                                    MWABloksScreenshotAndShareImplementation.INSTANCE.shareScreenshot(bitmapCreateBitmap, context);
                                } else {
                                    CFK.A06(MWABloksScreenshotAndShareImplementation.TAG, FGI.A0H("PixelCopy failed with result: ", i));
                                }
                            }
                        }, C60O.A02());
                        return null;
                    } catch (Exception e) {
                        CFK.A0J(TAG, e, FGI.A0M("Error capturing screenshot: ", e.getMessage()));
                        return null;
                    }
                }
            }
        }
        CFK.A06(TAG, "Cannot take screenshot: Activity not found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareScreenshot(Bitmap bitmap, Context context) {
        try {
            try {
                Uri uriSaveToMediaStoreQ = saveToMediaStoreQ(bitmap, context);
                if (uriSaveToMediaStoreQ == null) {
                    CFK.A06(TAG, "Failed to save screenshot to gallery");
                } else {
                    CFK.A05(TAG, AnonymousClass007.A0a("Screenshot saved to gallery: ", uriSaveToMediaStoreQ));
                    HatchFileActions.INSTANCE.shareLocal(context, new HatchFileRef.Local(uriSaveToMediaStoreQ, "screenshot.png"), null);
                    CFK.A05(TAG, "Share sheet opened successfully");
                }
            } catch (Exception e) {
                CFK.A0J(TAG, e, FGI.A0M("Error saving or sharing screenshot: ", e.getMessage()));
            }
        } finally {
            bitmap.recycle();
        }
    }

    private final Uri saveToMediaStoreLegacy(Bitmap bitmap, Context context) {
        Uri uri = null;
        try {
            String strInsertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, FGI.A0B(System.currentTimeMillis(), "Screenshot_"), "Screenshot captured from app");
            if (strInsertImage == null) {
                return null;
            }
            uri = Uri.parse(strInsertImage);
            return uri;
        } catch (Exception e) {
            CFK.A0J(TAG, e, FGI.A0M("Error using insertImage: ", e.getMessage()));
            return uri;
        }
    }

    private final Uri saveToMediaStoreQ(Bitmap bitmap, Context context) throws IOException {
        ContentResolver contentResolver = context.getContentResolver();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", FGI.A0J("Screenshot_", jCurrentTimeMillis, ".png"));
        contentValues.put(PhotosSearchHandlerKt.PARAM_MIME_TYPE, HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE);
        contentValues.put("relative_path", FGI.A0M(Environment.DIRECTORY_PICTURES, "/Screenshots"));
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return null;
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
        if (outputStreamOpenOutputStream != null) {
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } finally {
            }
        }
        return uriInsert;
    }
}
