package cn.ericallen.travelnotes.common.base;

import com.google.common.base.Optional;
import static cn.ericallen.travelnotes.common.base.Result.result;

public class BeanSupport {

  public static <T> boolean isNull(T reference) {
    Optional<T> optional = Optional.fromNullable(reference);
    return !optional.isPresent();
  }

  public static <T> Result<T> success() {
    return result(1);
  }

  public static <T> Result<T> success(T t) {
    return result(t);
  }

  public static <T> Result<T> fail() {
    return result(0);
  }

  public static <T> Result<T> fail(String message) {
    return new Result<T>(0, message);
  }

  public static <T> Result<T> fail(int ret) {
    return result(ret);
  }

  public static <T> Result<T> fail(int ret, T t) {
    return result(ret, t);
  }

}
