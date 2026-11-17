package com.facebook.pando;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.InterfaceC5106DYe;

/* loaded from: classes5.dex */
public interface IPandoGraphQLService {

    public final class Result<T> {
        public final Token cancelToken;
        public final T tree;

        public Result(T t, Token token) {
            C7384Etj.A0Y(token, 1);
            this.tree = t;
            this.cancelToken = token;
        }

        public final Result<T> copy(T t, Token token) {
            C7384Etj.A0Y(token, 1);
            return new Result<>(t, token);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Result) {
                    Result result = (Result) obj;
                    if (!C7384Etj.areEqual(this.tree, result.tree) || !C7384Etj.areEqual(this.cancelToken, result.cancelToken)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Result copy$default(Result result, Object obj, Token token, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = result.tree;
            }
            if ((i & 2) != 0) {
                token = result.cancelToken;
            }
            C7384Etj.A0Y(token, 1);
            return new Result(obj, token);
        }

        public final T component1() {
            return this.tree;
        }

        public final Token component2() {
            return this.cancelToken;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.cancelToken, AnonymousClass006.A0D(this.tree) * 31);
        }

        public String toString() {
            return C3cJ.A0L(this.cancelToken, ", cancelToken=", C3cG.A0f(this.tree, "Result(tree="));
        }
    }

    public interface Token extends InterfaceC5106DYe {
    }
}
