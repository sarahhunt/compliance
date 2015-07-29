package org.ga4gh;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link GAVariantSet.Builder} specific assertions - Generated by CustomAssertionGenerator.
 */
public class GAVariantSetBuilderAssert extends AbstractAssert<GAVariantSetBuilderAssert, GAVariantSet.Builder> {

  /**
   * Creates a new <code>{@link GAVariantSetBuilderAssert}</code> to make assertions on actual GAVariantSet.Builder.
   * @param actual the GAVariantSet.Builder we want to make assertions on.
   */
  public GAVariantSetBuilderAssert(GAVariantSet.Builder actual) {
    super(actual, GAVariantSetBuilderAssert.class);
  }

  /**
   * An entry point for GAVariantSetBuilderAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myGAVariantSet.Builder)</code> and get specific assertion with code completion.
   * @param actual the GAVariantSet.Builder we want to make assertions on.
   * @return a new <code>{@link GAVariantSetBuilderAssert}</code>
   */
  public static GAVariantSetBuilderAssert assertThat(GAVariantSet.Builder actual) {
    return new GAVariantSetBuilderAssert(actual);
  }

  /**
   * Verifies that the actual GAVariantSet.Builder's datasetId is equal to the given one.
   * @param datasetId the given datasetId to compare the actual GAVariantSet.Builder's datasetId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder's datasetId is not equal to the given one.
   */
  public GAVariantSetBuilderAssert hasDatasetId(String datasetId) {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting datasetId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualDatasetId = actual.getDatasetId();
    if (!Objects.areEqual(actualDatasetId, datasetId)) {
      failWithMessage(assertjErrorMessage, actual, datasetId, actualDatasetId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder's id is equal to the given one.
   * @param id the given id to compare the actual GAVariantSet.Builder's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder's id is not equal to the given one.
   */
  public GAVariantSetBuilderAssert hasId(String id) {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualId = actual.getId();
    if (!Objects.areEqual(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder's metadata contains the given GAVariantSetMetadata elements.
   * @param metadata the given elements that should be contained in actual GAVariantSet.Builder's metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual GAVariantSet.Builder's metadata does not contain all given GAVariantSetMetadata elements.
   */
  public GAVariantSetBuilderAssert hasMetadata(GAVariantSetMetadata... metadata) {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given GAVariantSetMetadata varargs is not null.
    if (metadata == null) failWithMessage("Expecting metadata parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getMetadata(), metadata);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder's metadata contains <b>only<b> the given GAVariantSetMetadata elements and nothing else in whatever order.
   * @param metadata the given elements that should be contained in actual GAVariantSet.Builder's metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual GAVariantSet.Builder's metadata does not contain all given GAVariantSetMetadata elements.
   */
  public GAVariantSetBuilderAssert hasOnlyMetadata(GAVariantSetMetadata... metadata) {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given GAVariantSetMetadata varargs is not null.
    if (metadata == null) failWithMessage("Expecting metadata parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getMetadata(), metadata);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder's metadata does not contain the given GAVariantSetMetadata elements.
   *
   * @param metadata the given elements that should not be in actual GAVariantSet.Builder's metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual GAVariantSet.Builder's metadata contains any given GAVariantSetMetadata elements.
   */
  public GAVariantSetBuilderAssert doesNotHaveMetadata(GAVariantSetMetadata... metadata) {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given GAVariantSetMetadata varargs is not null.
    if (metadata == null) failWithMessage("Expecting metadata parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getMetadata(), metadata);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder has no metadata.
   * @return this assertion object.
   * @throws AssertionError if the actual GAVariantSet.Builder's metadata is not empty.
   */
  public GAVariantSetBuilderAssert hasNoMetadata() {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have metadata but had :\n  <%s>";
    
    // check
    if (actual.getMetadata().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getMetadata());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual GAVariantSet.Builder has dataset id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder does not have dataset id.
   */
  public GAVariantSetBuilderAssert hasDatasetId() {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasDatasetId()) {
      failWithMessage("\nExpecting that actual GAVariantSet.Builder has dataset id but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder does not have dataset id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder has dataset id.
   */
  public GAVariantSetBuilderAssert doesNotHaveDatasetId() {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasDatasetId()) {
      failWithMessage("\nExpecting that actual GAVariantSet.Builder does not have dataset id but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder has id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder does not have id.
   */
  public GAVariantSetBuilderAssert hasId() {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasId()) {
      failWithMessage("\nExpecting that actual GAVariantSet.Builder has id but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder does not have id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder has id.
   */
  public GAVariantSetBuilderAssert doesNotHaveId() {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasId()) {
      failWithMessage("\nExpecting that actual GAVariantSet.Builder does not have id but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder has metadata.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder does not have metadata.
   */
  public GAVariantSetBuilderAssert hasMetadata() {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasMetadata()) {
      failWithMessage("\nExpecting that actual GAVariantSet.Builder has metadata but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAVariantSet.Builder does not have metadata.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAVariantSet.Builder has metadata.
   */
  public GAVariantSetBuilderAssert doesNotHaveMetadata() {
    // check that actual GAVariantSet.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasMetadata()) {
      failWithMessage("\nExpecting that actual GAVariantSet.Builder does not have metadata but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

}
