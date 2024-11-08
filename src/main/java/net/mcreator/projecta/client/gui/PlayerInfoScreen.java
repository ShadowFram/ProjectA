package net.mcreator.projecta.client.gui;

public class PlayerInfoScreen extends AbstractContainerScreen<PlayerInfoMenu> {

	private final static HashMap<String, Object> guistate = PlayerInfoMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PlayerInfoScreen(PlayerInfoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("project_a:textures/screens/player_info.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		if (

		PlayerShowProcProcedure.execute(world, x, y, z)

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -52, this.topPos + 3, 55, 0f, 0, livingEntity);
		}

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("project_a:textures/screens/playergui.png"), this.leftPos + -103, this.topPos + -120, 0, 0, 210, 240, 210, 240);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.project_a.player_info.label_level"), -16, -88, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.project_a.player_info.label_name"), -16, -102, -12829636, false);
		guiGraphics.drawString(this.font,

				LevelShowProcedure.execute(), 15, -89, -12829636, false);
		guiGraphics.drawString(this.font,

				PlayerNameShowProcedure.execute(entity), 10, -103, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.project_a.player_info.label_xp"), -16, -78, -12829636, false);
		guiGraphics.drawString(this.font,

				XPShowProcedure.execute(), -1, -79, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

	}

}
