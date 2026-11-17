package com.facebook.aura.feedback.repo;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes.dex */
public interface FeedbackJarvisPath extends JarvisPath.Extension {

    public final class Feedback implements FeedbackJarvisPath {
        public static final Feedback INSTANCE = new Feedback();
        public static final String value = "api/feedback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Feedback);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Feedback";
        }

        public int hashCode() {
            return 270913537;
        }
    }
}
