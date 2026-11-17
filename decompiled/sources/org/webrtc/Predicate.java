package org.webrtc;

/* loaded from: classes5.dex */
public interface Predicate<T> {

    /* renamed from: org.webrtc.Predicate$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            return new AnonymousClass2(predicate, predicate2);
        }

        public static Predicate $default$negate(Predicate predicate) {
            return new AnonymousClass3();
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            return new AnonymousClass1(predicate, predicate2);
        }
    }

    /* renamed from: org.webrtc.Predicate$1, reason: invalid class name */
    public class AnonymousClass1 implements Predicate<T> {
        public final /* synthetic */ Predicate this$0;
        public final /* synthetic */ Predicate val$other;

        public AnonymousClass1(Predicate predicate, Predicate predicate2) {
            this.val$other = predicate2;
            this.this$0 = predicate;
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new AnonymousClass2(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate negate() {
            return new AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate or(Predicate predicate) {
            return new AnonymousClass1(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(T t) {
            return this.this$0.test(t) || this.val$other.test(t);
        }
    }

    /* renamed from: org.webrtc.Predicate$2, reason: invalid class name */
    public class AnonymousClass2 implements Predicate<T> {
        public final /* synthetic */ Predicate this$0;
        public final /* synthetic */ Predicate val$other;

        public AnonymousClass2(Predicate predicate, Predicate predicate2) {
            this.val$other = predicate2;
            this.this$0 = predicate;
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new AnonymousClass2(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate negate() {
            return new AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate or(Predicate predicate) {
            return new AnonymousClass1(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(T t) {
            return this.this$0.test(t) && this.val$other.test(t);
        }
    }

    /* renamed from: org.webrtc.Predicate$3, reason: invalid class name */
    public class AnonymousClass3 implements Predicate<T> {
        public AnonymousClass3() {
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new AnonymousClass2(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate negate() {
            return new AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate or(Predicate predicate) {
            return new AnonymousClass1(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(T t) {
            return !Predicate.this.test(t);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
