package com.facebook.aura.partners.voice.uicontrol;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class PreviewVoiceOptionUiAction extends C06G implements ContributedUiAction {
    public final String voiceId;
    public final String widgetId;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.PreviewVoiceOptionUiAction", f = "VoiceUiCommands.kt", l = {432, 461, 462, 474}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.PreviewVoiceOptionUiAction$perform$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreviewVoiceOptionUiAction.this.perform(null, this);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PreviewVoiceOptionUiAction) {
                PreviewVoiceOptionUiAction previewVoiceOptionUiAction = (PreviewVoiceOptionUiAction) obj;
                if (!C7384Etj.areEqual(this.widgetId, previewVoiceOptionUiAction.widgetId) || !C7384Etj.areEqual(this.voiceId, previewVoiceOptionUiAction.voiceId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoicePreviewOutcome.values().length];
            try {
                AnonymousClass002.A13(VoicePreviewOutcome.PLAYED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoicePreviewOutcome.INTERRUPTED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoicePreviewOutcome.FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ PreviewVoiceOptionUiAction copy$default(PreviewVoiceOptionUiAction previewVoiceOptionUiAction, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewVoiceOptionUiAction.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = previewVoiceOptionUiAction.voiceId;
        }
        return new PreviewVoiceOptionUiAction(str, str2);
    }

    public final String component1() {
        return this.widgetId;
    }

    public final String component2() {
        return this.voiceId;
    }

    public final PreviewVoiceOptionUiAction copy(String str, String str2) {
        return new PreviewVoiceOptionUiAction(str, str2);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.widgetId) * 31) + AnonymousClass005.A0H(this.voiceId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b A[Catch: Exception -> 0x0133, CancellationException -> 0x017f, TryCatch #0 {CancellationException -> 0x017f, blocks: (B:72:0x0127, B:73:0x012a, B:75:0x012e, B:64:0x0104, B:65:0x0107, B:67:0x010b, B:69:0x010f, B:61:0x00ed), top: B:101:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(X.AbstractC3358CGz r15, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r16) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.uicontrol.PreviewVoiceOptionUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    public PreviewVoiceOptionUiAction(String str, String str2) {
        this.widgetId = str;
        this.voiceId = str2;
    }

    public String toString() {
        return super.toString();
    }
}
