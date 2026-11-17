package com.facebook.aura.settings.importmemory;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.settings.importmemory.ChatUploadState;

/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchUiState extends C06G {
    public static final int $stable = 8;
    public final ChatUploadError chatUploadError;
    public final ChatUploadState chatUploadState;
    public final boolean isSending;
    public final String pastedText;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchImportMemoryToHatchUiState) {
                HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState = (HatchImportMemoryToHatchUiState) obj;
                if (!C7384Etj.areEqual(this.pastedText, hatchImportMemoryToHatchUiState.pastedText) || this.isSending != hatchImportMemoryToHatchUiState.isSending || !C7384Etj.areEqual(this.chatUploadState, hatchImportMemoryToHatchUiState.chatUploadState) || this.chatUploadError != hatchImportMemoryToHatchUiState.chatUploadError) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchImportMemoryToHatchUiState copy$default(HatchImportMemoryToHatchUiState hatchImportMemoryToHatchUiState, String str, boolean z, ChatUploadState chatUploadState, ChatUploadError chatUploadError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchImportMemoryToHatchUiState.pastedText;
        }
        if ((i & 2) != 0) {
            z = hatchImportMemoryToHatchUiState.isSending;
        }
        if ((i & 4) != 0) {
            chatUploadState = hatchImportMemoryToHatchUiState.chatUploadState;
        }
        if ((i & 8) != 0) {
            chatUploadError = hatchImportMemoryToHatchUiState.chatUploadError;
        }
        AnonymousClass003.A0v(str, chatUploadState);
        return new HatchImportMemoryToHatchUiState(str, z, chatUploadState, chatUploadError);
    }

    public final String component1() {
        return this.pastedText;
    }

    public final boolean component2() {
        return this.isSending;
    }

    public final ChatUploadState component3() {
        return this.chatUploadState;
    }

    public final ChatUploadError component4() {
        return this.chatUploadError;
    }

    public final ChatUploadError getChatUploadError() {
        return this.chatUploadError;
    }

    public final ChatUploadState getChatUploadState() {
        return this.chatUploadState;
    }

    public final String getPastedText() {
        return this.pastedText;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.chatUploadState, C0KA.A01(AnonymousClass001.A0G(this.pastedText), this.isSending)) + AnonymousClass006.A0D(this.chatUploadError);
    }

    public final boolean isSending() {
        return this.isSending;
    }

    public HatchImportMemoryToHatchUiState(String str, boolean z, ChatUploadState chatUploadState, ChatUploadError chatUploadError) {
        AnonymousClass003.A0v(str, chatUploadState);
        this.pastedText = str;
        this.isSending = z;
        this.chatUploadState = chatUploadState;
        this.chatUploadError = chatUploadError;
    }

    public final HatchImportMemoryToHatchUiState copy(String str, boolean z, ChatUploadState chatUploadState, ChatUploadError chatUploadError) {
        AnonymousClass003.A0v(str, chatUploadState);
        return new HatchImportMemoryToHatchUiState(str, z, chatUploadState, chatUploadError);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchImportMemoryToHatchUiState(String str, boolean z, ChatUploadState chatUploadState, ChatUploadError chatUploadError, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? ChatUploadState.Idle.INSTANCE : chatUploadState, (i & 8) != 0 ? null : chatUploadError);
    }

    public HatchImportMemoryToHatchUiState() {
        this("", false, ChatUploadState.Idle.INSTANCE, null);
    }
}
