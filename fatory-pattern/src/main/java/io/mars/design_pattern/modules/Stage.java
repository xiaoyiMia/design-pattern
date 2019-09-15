package io.mars.design_pattern.modules;

public abstract class Stage {

  private String stageType;

  public Stage(String stageType) {
    this.stageType = stageType;
  }

  public String getStageType() {
    return stageType;
  }
}
