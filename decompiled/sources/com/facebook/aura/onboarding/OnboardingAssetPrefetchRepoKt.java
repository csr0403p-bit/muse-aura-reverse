package com.facebook.aura.onboarding;

import X.C60O;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class OnboardingAssetPrefetchRepoKt {
    public static final String GREETING_VIDEO_ASSET = "video_1";
    public static final String KEY_CACHED_PUBLIC_URLS_JSON = "cached_public_urls_json";
    public static final String KEY_PREFETCH_COMPLETED = "prefetch_completed";
    public static final String ONBOARDING_ASSETS_BASE_URL = "https://hatch-api.meta.ai";
    public static final String ONBOARDING_ASSETS_ENDPOINT = "/hatch/onboarding/assets/cdn-urls";
    public static final String TAG = "OnboardingAssetPrefetch";
    public static final Set<String> VIDEO_EXTENSIONS = C60O.A1B("mp4", "mov", "webm", "m4v");
}
