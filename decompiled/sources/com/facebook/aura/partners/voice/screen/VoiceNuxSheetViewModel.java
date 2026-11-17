package com.facebook.aura.partners.voice.screen;

import X.AEs;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.partners.voice.infra.VoiceNuxRepository;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VoiceNuxSheetViewModel extends AEs {
    public static final int $stable = 8;
    public Choice choice;
    public final boolean isMetaAppStart;
    public final Map<String, String> logMetadata;
    public final VoiceCallStart start;
    public final String threadId;
    public final AbstractC3358CGz userSession;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Choice {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Choice[] $VALUES;
        public static final Choice CONTINUE;
        public static final Choice NOT_NOW;

        static {
            Choice choice = new Choice("CONTINUE", 0);
            CONTINUE = choice;
            Choice choice2 = new Choice("NOT_NOW", 1);
            NOT_NOW = choice2;
            Choice[] choiceArr = {choice, choice2};
            $VALUES = choiceArr;
            $ENTRIES = C3cG.A0w(choiceArr);
        }

        public static Ey9<Choice> getEntries() {
            return $ENTRIES;
        }

        public static Choice valueOf(String str) {
            return (Choice) Enum.valueOf(Choice.class, str);
        }

        public static Choice[] values() {
            return (Choice[]) $VALUES.clone();
        }

        public Choice(String str, int i) {
        }
    }

    /* loaded from: classes.dex */
    public final class Factory extends AuraViewModelFactory<VoiceNuxSheetViewModel> {
        public static final int $stable = 8;
        public final VoiceCallStart start;
        public final String threadId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public VoiceNuxSheetViewModel create() {
            return new VoiceNuxSheetViewModel(this.userSession, this.threadId, this.start);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, VoiceCallStart voiceCallStart) {
            AnonymousClass003.A0v(abstractC3358CGz, voiceCallStart);
            this.userSession = abstractC3358CGz;
            this.threadId = str;
            this.start = voiceCallStart;
        }
    }

    public final Map<String, String> getLogMetadata() {
        return this.logMetadata;
    }

    public final void onContinue() {
        Choice choice = this.choice;
        if (choice == null) {
            choice = Choice.CONTINUE;
        }
        this.choice = choice;
    }

    public final void onNotNow() {
        Choice choice = this.choice;
        if (choice == null) {
            choice = Choice.NOT_NOW;
        }
        this.choice = choice;
    }

    public final void onSheetClosed() {
        if (!this.isMetaAppStart || this.choice == Choice.CONTINUE) {
            if (this.choice == Choice.CONTINUE) {
                VoiceCallStarterKt.startVoiceCallAfterNux(this.userSession, this.threadId, this.start);
            } else {
                VoiceNuxRepository.Companion.getInstance(this.userSession).markSeen();
            }
        }
    }

    public VoiceNuxSheetViewModel(AbstractC3358CGz abstractC3358CGz, String str, VoiceCallStart voiceCallStart) {
        AnonymousClass003.A0v(abstractC3358CGz, voiceCallStart);
        this.userSession = abstractC3358CGz;
        this.threadId = str;
        this.start = voiceCallStart;
        this.isMetaAppStart = AnonymousClass002.A1Z(voiceCallStart.entryPoint, VoiceCallEntryPoint.META_APP);
        this.logMetadata = VoiceNuxSheetViewModelKt.voiceNuxLogMetadata(abstractC3358CGz, voiceCallStart);
    }
}
