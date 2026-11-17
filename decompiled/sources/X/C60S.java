package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.aura.model.HatchToolCallResult;
import com.facebook.aura.model.HatchTranscriptJsonKt;
import com.facebook.aura.model.ToolCallMetadataJson;
import com.facebook.aura.widgets.ListWidgetItemJson;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.60S, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60S {
    /* JADX WARN: Multi-variable type inference failed */
    public static BzB A01(HxE hxE) throws IOException {
        HxE[] hxEArr = {hxE};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HxE hxE2 = hxEArr[0];
        AbstractC7388EuC.A00(hxE2.second, (String) hxE2.first, linkedHashMap);
        BzB bzB = new BzB(linkedHashMap);
        BzB.A00(bzB);
        return bzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(Context context, BFM bfm, AbstractCollection abstractCollection, Iterator it) throws Resources.NotFoundException {
        HwV hwV = (HwV) it.next();
        int iIntValue = ((Number) hwV.first).intValue();
        int iIntValue2 = ((Number) hwV.second).intValue();
        int iIntValue3 = ((Number) hwV.third).intValue();
        String resourceEntryName = context.getResources().getResourceEntryName(iIntValue2);
        C7384Etj.A0U(resourceEntryName);
        abstractCollection.add(new ListWidgetItemJson(resourceEntryName, AbstractC2271BQs.A01(bfm, iIntValue2), AbstractC2271BQs.A01(bfm, iIntValue3), AbstractC2271BQs.A01(bfm, iIntValue), null, false));
    }

    public static void A04(WebView webView) {
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    public static void A05(WebView webView) {
        webView.getSettings().setDomStorageEnabled(false);
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setMixedContentMode(1);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(true);
        webView.setBackgroundColor(-1);
    }

    public static boolean A06(HatchToolCallResult hatchToolCallResult) {
        JsonElement jsonElement;
        ToolCallMetadataJson toolCallMetadata;
        return (hatchToolCallResult == null || (jsonElement = hatchToolCallResult.metadata) == null || (toolCallMetadata = HatchTranscriptJsonKt.toToolCallMetadata(jsonElement)) == null || !"image".equals(toolCallMetadata.file_type) || toolCallMetadata.file_paths.isEmpty()) ? false : true;
    }

    public static Set A02() {
        return BFI.A0H(new String[]{"avif", "bmp", "gif", "heic", "heif", "ico", "jpeg", "jpg", "m4a", "m4v", "mov", "mp3", "mp4", "ogg", "ogv", "png", "svg", "tif", "tiff", "wav", "webm", "webp"});
    }

    public static Intent A00(ComponentName componentName) {
        String strFlattenToString = componentName.flattenToString();
        C7384Etj.A0U(strFlattenToString);
        if (Build.VERSION.SDK_INT >= 30) {
            Intent intentPutExtra = new Intent("android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS").putExtra("android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME", strFlattenToString);
            C7384Etj.A0X(intentPutExtra);
            return intentPutExtra;
        }
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        intent.putExtra(":settings:fragment_args_key", strFlattenToString);
        intent.putExtra("EXTRA_PREFS_SHOW_BUTTON_BAR", true);
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", strFlattenToString);
        intent.putExtra(":settings:show_fragment_args", bundle);
        return intent;
    }
}
