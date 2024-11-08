
package net.mcreator.projecta.client.renderer;

public class TestRenderer extends HumanoidMobRenderer<TestEntity, HumanoidModel<TestEntity>> {

	public TestRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(TestEntity entity) {
		return new ResourceLocation("project_a:textures/entities/sss.png");
	}

}
