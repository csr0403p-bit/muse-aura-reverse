package com.facebook.aura.partners.voice.api;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface VoiceJarvisPath extends JarvisPath.Extension {

    public final class VoiceActiveVoice implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceActiveVoice INSTANCE = new VoiceActiveVoice();
        public static final String value = "api/voice/active-voice";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceActiveVoice);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceActiveVoice";
        }

        public int hashCode() {
            return 378311183;
        }
    }

    /* loaded from: classes2.dex */
    public final class VoiceAnnouncement implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceAnnouncement INSTANCE = new VoiceAnnouncement();
        public static final String value = "api/voice/announcement";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceAnnouncement);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceAnnouncement";
        }

        public int hashCode() {
            return 1788225892;
        }
    }

    public final class VoiceAvailableVoices implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceAvailableVoices INSTANCE = new VoiceAvailableVoices();
        public static final String value = "api/voice/available-voices";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceAvailableVoices);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceAvailableVoices";
        }

        public int hashCode() {
            return 989238381;
        }
    }

    public final class VoiceCallsPreviewVoice implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceCallsPreviewVoice INSTANCE = new VoiceCallsPreviewVoice();
        public static final String value = "api/voice/calls/preview-voice";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceCallsPreviewVoice);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceCallsPreviewVoice";
        }

        public int hashCode() {
            return 831350466;
        }
    }

    /* loaded from: classes6.dex */
    public final class VoiceCallsUserSpeech implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceCallsUserSpeech INSTANCE = new VoiceCallsUserSpeech();
        public static final String value = "api/voice/calls/user-speech";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceCallsUserSpeech);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceCallsUserSpeech";
        }

        public int hashCode() {
            return 151230213;
        }
    }

    public final class VoiceCatalog implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceCatalog INSTANCE = new VoiceCatalog();
        public static final String value = "api/voice/catalog";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceCatalog);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceCatalog";
        }

        public int hashCode() {
            return -490363428;
        }
    }

    public final class VoiceCatalogFilters implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceCatalogFilters INSTANCE = new VoiceCatalogFilters();
        public static final String value = "api/voice/catalog/filters";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceCatalogFilters);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceCatalogFilters";
        }

        public int hashCode() {
            return -44923265;
        }
    }

    /* loaded from: classes6.dex */
    public final class VoiceMicStatus implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceMicStatus INSTANCE = new VoiceMicStatus();
        public static final String value = "api/voice/mic-status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceMicStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceMicStatus";
        }

        public int hashCode() {
            return -1226427876;
        }
    }

    /* loaded from: classes6.dex */
    public final class VoiceOnboardingReset implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceOnboardingReset INSTANCE = new VoiceOnboardingReset();
        public static final String value = "api/voice/onboarding/reset";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceOnboardingReset);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceOnboardingReset";
        }

        public int hashCode() {
            return -299408713;
        }
    }

    /* loaded from: classes6.dex */
    public final class VoicePlaybackStatus implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoicePlaybackStatus INSTANCE = new VoicePlaybackStatus();
        public static final String value = "api/voice/playback-status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoicePlaybackStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoicePlaybackStatus";
        }

        public int hashCode() {
            return 1383832266;
        }
    }

    /* loaded from: classes2.dex */
    public final class VoiceSpeak implements VoiceJarvisPath {
        public static final int $stable = 0;
        public static final VoiceSpeak INSTANCE = new VoiceSpeak();
        public static final String value = "api/voice/speak";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceSpeak);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceSpeak";
        }

        public int hashCode() {
            return -1183065515;
        }
    }
}
